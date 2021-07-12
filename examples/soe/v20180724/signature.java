package soe.v20180724;

import com.squareup.okhttp.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class signature {


    private final static Charset UTF8 = StandardCharsets.UTF_8;
    private final static String SECRET_ID = "";
    private final static String SECRET_KEY = "";
    private final static String CT_JSON = "application/json; charset=utf-8";

    public signature() throws IOException {
    }

    public static byte[] hmac256(byte[] key, String msg) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        mac.init(secretKeySpec);
        return mac.doFinal(msg.getBytes(UTF8));
    }

    public static String sha256Hex(String s) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] d = md.digest(s.getBytes(UTF8));
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    public static void main(String[] args) throws Exception {
        String AUDIO_FOR_ONCE = "./bike.mp3";

        byte[] buf = Files.readAllBytes(Paths.get(AUDIO_FOR_ONCE));
        String base64Str = Base64.getEncoder().encodeToString(buf);
        String service = "soe";
        String host = "soe.tencentcloudapi.com";
        String region = "ap-guangzhou";
        String action = "TransmitOralProcessWithInit";
        String version = "2018-07-24";
        String algorithm = "TC3-HMAC-SHA256";
//        String timestamp = "1551113065";
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 注意时区，否则容易出错
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));

        // ************* 步骤 1：拼接规范请求串 *************
        String httpRequestMethod = "POST";
        String canonicalUri = "/";
        String canonicalQueryString = "";
        String canonicalHeaders = "content-type:application/json; charset=utf-8\n" + "host:" + host + "\n";
        String signedHeaders = "content-type;host";
        String SessionId = UUID.randomUUID().toString();
        String params = "{\"SessionId\": %S, \"SeqId\": 1, \"IsEnd\": 1, \"VoiceFileType\": 3, \"VoiceEncodeType\": 1, \"UserVoiceData\": %S, \"RefText\": \"what\", \"WorkMode\": 1, \"EvalMode\": 0, \"ScoreCoeff\": 3.0}";
        String payload = String.format(params, SessionId, base64Str);


        String hashedRequestPayload = sha256Hex(payload);
        String canonicalRequest = httpRequestMethod + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n"
                + canonicalHeaders + "\n" + signedHeaders + "\n" + hashedRequestPayload;
        System.out.println(canonicalRequest);

        // ************* 步骤 2：拼接待签名字符串 *************
        String credentialScope = date + "/" + service + "/" + "tc3_request";
        String hashedCanonicalRequest = sha256Hex(canonicalRequest);
        String stringToSign = algorithm + "\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;
        System.out.println(stringToSign);

        // ************* 步骤 3：计算签名 *************
        byte[] secretDate = hmac256(("TC3" + SECRET_KEY).getBytes(UTF8), date);
        byte[] secretService = hmac256(secretDate, service);
        byte[] secretSigning = hmac256(secretService, "tc3_request");
        String signature = DatatypeConverter.printHexBinary(hmac256(secretSigning, stringToSign)).toLowerCase();
        System.out.println(signature);

        // ************* 步骤 4：拼接 Authorization *************
        String authorization = algorithm + " " + "Credential=" + SECRET_ID + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", " + "Signature=" + signature;
        System.out.println(authorization);

        TreeMap<String, String> headers = new TreeMap<String, String>();
        headers.put("Authorization", authorization);
        headers.put("Content-Type", CT_JSON);
        headers.put("Host", host);
        headers.put("X-TC-Action", action);
        headers.put("X-TC-Timestamp", timestamp);
        headers.put("X-TC-Version", version);
        headers.put("X-TC-Region", region);

        StringBuilder sb = new StringBuilder();
        sb.append("curl -X POST https://").append(host)
                .append(" -H \"Authorization: ").append(authorization).append("\"")
                .append(" -H \"Content-Type: application/json; charset=utf-8\"")
                .append(" -H \"Host: ").append(host).append("\"")
                .append(" -H \"X-TC-Action: ").append(action).append("\"")
                .append(" -H \"X-TC-Timestamp: ").append(timestamp).append("\"")
                .append(" -H \"X-TC-Version: ").append(version).append("\"")
                .append(" -H \"X-TC-Region: ").append(region).append("\"")
                .append(" -d '").append(payload).append("'");
        System.out.println(sb.toString());
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, payload);
        Request request = new Request.Builder()
                .url("https://soe.tencentcloudapi.com")
                .post(body)
                .addHeader("Authorization", authorization)
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .addHeader("Host", host)
                .addHeader("X-TC-Action", action)
                .addHeader("X-TC-Timestamp", timestamp)
                .addHeader("X-TC-Version", version)
                .addHeader("X-TC-Region", region)
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response);

    }

}
