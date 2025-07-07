/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateByPackageRequest extends AbstractModel {

    /**
    * 证书产品PID，以下是对每个PID及其对应的证书文字说明：
1. 1022451 - CFCA-增强型(EV)SSL证书
2. 1022449 - CFCA-企业型(OV) SSL证书(通配符)
3. 1022447 - CFCA-企业型(OV)SSL证书
4. 1014028 - DNSPod亚信国密-企业型(OV)通配符证书
5. 1014030 - DNSPod亚信国密-企业型(OV)多域名证书
6. 1014026 - DNSPod亚信国密-企业型(OV)证书
7. 1014022 - DNSPod亚信国密-域名型(DV)通配符证书
8. 1014024 - DNSPod亚信国密-域名型(DV)多域名证书
9. 1014020 - DNSPod亚信国密-域名型(DV)证书
10. 1013949 - DNSPod SSL 域名型SSL证书(C1)
11. 1013953 - DNSPod SSL域名型多域名SSL证书(C1)
12. 1013951 - DNSPod-SSL域名型DV（泛域名）
13. 1013955 - DNSPod 企业型SSL证书(C1)
14. 1013959 - DNSPod 企业型多域名SSL证书(C1)
15. 1013957 - DNSPod 企业型通配符SSL证书(C1)
16. 1013961 - DNSPod 增强型 SSL 证书(C1)
17. 1013963 - DNSPod 增强型多域名SSL证书(C1)
18. 1005919 - TrustAsia-域名型DV（通配符多域名）
19. 1013882 - SecureSite-增强型专业版EVPro（多域名）
20. 1018559 - SecureSite-增强型专业版EVPro（单域名）
21. 1013910 - GlobalSign-增强型EV（多域名）
22. 1013904 - GlobalSign-增强型EV（单域名）
23. 1013898 - TrustAsia-增强型EV（多域名）
24. 1013888 - TrustAsia-增强型EV（单域名）
25. 1013886 - GeoTrust-增强型EV（多域名）
26. 1018529 - GeoTrust-增强型EV（单域名）
27. 1013880 - SecureSite-增强型EV（多域名）
28. 1018557 - SecureSite-增强型EV（单域名）
29. 1018586 - TrustAsia-域名型DV（泛域名）
30. 1018584 - TrustAsia-域名型DV（多域名）
31. 1013878 - SecureSite-企业型专业版OV Pro（多域名）
32. 1018582 - SecureSite-企业型专业版OV Pro（单域名）
33. 1013908 - GlobalSign-企业型OV（通配符多域名）
34. 1013902 - GlobalSign-企业型OV（泛域名）
35. 1013906 - GlobalSign-企业型OV（多域名）
36. 1013900 - GlobalSign-企业型OV（单域名）
37. 1013896 - TrustAsia-企业型OV（通配符多域名）
38. 1013892 - TrustAsia-企业型OV（泛域名）
39. 1013894 - TrustAsia-企业型OV（多域名）
40. 1013890 - TrustAsia-企业型OV（单域名）
41. 1004360 - GeoTrust-企业型OV（泛域名）
42. 1013884 - GeoTrust-企业型OV（单域名）
43. 1013874 - SecureSite-企业型OV（泛域名）
44. 1013876 - SecureSite-企业型OV（多域名）
45. 1018580 - SecureSite-企业型OV（单域名）
46. 1004460 - DNSPod-国密增强型证书（多域名）
47. 1004458 - DNSPod-国密增强型证书
48. 1004370 - DNSPod-国密企业型证书（通配符）
49. 1004368 - DNSPod-国密企业型证书（多域名）
50. 1004366 - DNSPod-国密企业型证书
51. 1004362 - DNSPod-国密域名型证书（通配符）
52. 1004364 - DNSPod-国密域名型证书（多域名）
53. 1004358 - DNSPod-国密域名型证书
54. 1004456 - WoTrus-增强型证书（多域名）
55. 1004454 - WoTrus-增强型证书
56. 1004168 - WoTrus-企业型证书（通配符）
57. 1004166 - WoTrus-企业型证书（多域名）
58. 1004164 - WoTrus-企业型证书
59. 1004159 - WoTrus-域名型证书（通配符）
60. 1004161 - WoTrus-域名型证书（多域名）
61. 1004157 - WoTrus-域名型证书
    */
    @SerializedName("ProductPid")
    @Expose
    private Long ProductPid;

    /**
    * 要消耗的权益包ID。
    */
    @SerializedName("PackageIds")
    @Expose
    private String [] PackageIds;

    /**
    * 证书域名数量。
    */
    @SerializedName("DomainCount")
    @Expose
    private String DomainCount;

    /**
    * 多年期证书年限。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 要续费的原证书ID（续费时填写）。
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 续费时CSR生成方式（original、upload、online）。
    */
    @SerializedName("RenewGenCsrMethod")
    @Expose
    private String RenewGenCsrMethod;

    /**
    * 续费时选择上传CSR时填写CSR。
    */
    @SerializedName("RenewCsr")
    @Expose
    private String RenewCsr;

    /**
    * 续费证书CSR的算法类型：RSA,ECC,SM2
    */
    @SerializedName("RenewAlgorithmType")
    @Expose
    private String RenewAlgorithmType;

    /**
    * 续费证书CSR的算法参数:2048,4096,prime256v1
    */
    @SerializedName("RenewAlgorithmParam")
    @Expose
    private String RenewAlgorithmParam;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 续费证书的私钥密码。
    */
    @SerializedName("RenewKeyPass")
    @Expose
    private String RenewKeyPass;

    /**
    * 批量购买证书时预填写的域名。
    */
    @SerializedName("DomainNames")
    @Expose
    private String DomainNames;

    /**
    * 批量购买证书数量。
    */
    @SerializedName("CertificateCount")
    @Expose
    private Long CertificateCount;

    /**
    * 预填写的管理人ID。
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
    * 预填写的公司ID。
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 验证方式
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 询价参数，以下是对每个询价参数及其对应的证书文字说明：
1. sv_ssl_cost_cfca_ca_ev - CFCA-增强型(EV)SSL证书
2. sv_ssl_cost_cfca_ca_ovwildcard - CFCA-企业型(OV) SSL证书(通配符)
3. sv_ssl_cost_cfca_ca_ov - CFCA-企业型(OV)SSL证书
4. sv_ssl_cost_dnspod_ca_sm2_ovwildcard - DNSPod亚信国密-企业型(OV)通配符证书
5. sv_ssl_cost_dnspod_ca_sm2_ovmultidomain - DNSPod亚信国密-企业型(OV)多域名证书
6. sv_ssl_cost_dnspod_ca_sm2_ov - DNSPod亚信国密-企业型(OV)证书
7. sv_ssl_cost_dnspod_ca_sm2_dvwildcard - DNSPod亚信国密-域名型(DV)通配符证书
8. sv_ssl_cost_dnspod_ca_sm2_dvmultidomain - DNSPod亚信国密-域名型(DV)多域名证书
9. sv_ssl_cost_dnspod_ca_sm2_dv - DNSPod亚信国密-域名型(DV)证书
10. sv_ssl_cost_dnspod_ca_dv - DNSPod SSL 域名型SSL证书(C1)
11. sv_ssl_cost_dnspod_ca_dvmultidomain - DNSPod SSL域名型多域名SSL证书(C1)
12. sv_ssl_cost_dnspod_ca_dvwildcard - DNSPod-SSL域名型DV（泛域名）
13. sv_ssl_cost_dnspod_ca_ov - DNSPod 企业型SSL证书(C1)
14. sv_ssl_cost_dnspod_ca_ovmultidomain - DNSPod 企业型多域名SSL证书(C1)
15. sv_ssl_cost_dnspod_ca_ovwildcard - DNSPod 企业型通配符SSL证书(C1)
16. sv_ssl_cost_dnspod_ca_ev - DNSPod 增强型 SSL 证书(C1)
17. sv_ssl_cost_dnspod_ca_evmultidomain - DNSPod 增强型多域名SSL证书(C1)
18. sv_ssl_cost_trustasia_dvwildcardmulti - TrustAsia-域名型DV（通配符多域名）
19. sv_ssl_cost_securesiteevpromul_sh - SecureSite-增强型专业版EVPro（多域名）
20. sv_ssl_cost_symantec_evpro - SecureSite-增强型专业版EVPro（单域名）
21. sv_ssl_cost_globalsign_ev_mul_sh - GlobalSign-增强型EV（多域名）
22. sv_ssl_cost_globalsign_ev - GlobalSign-增强型EV（单域名）
23. sv_ssl_cost_trustasia_evmultidomain - TrustAsia-增强型EV（多域名）
24. sv_ssl_cost_trustasia_ev - TrustAsia-增强型EV（单域名）
25. sv_ssl_cost_geotrust_evmultidomain - GeoTrust-增强型EV（多域名）
26. sv_ssl_cost_geotrust_ev - GeoTrust-增强型EV（单域名）
27. sv_ssl_cost_symantec_evmultidomain - SecureSite-增强型EV（多域名）
28. sv_ssl_cost_symantec_ev - SecureSite-增强型EV（单域名）
29. sv_ssl_cost_trustasia_dvwildcard - TrustAsia-域名型DV（泛域名）
30. sv_ssl_cost_trustasia_dvmultidomain - TrustAsia-域名型DV（多域名）
31. sv_ssl_cost_symantec_ovpromultidomain - SecureSite-企业型专业版OV Pro（多域名）
32. sv_ssl_cost_symantec_ovpro - SecureSite-企业型专业版OV Pro（单域名）
33. sv_ssl_cost_globalsign_ovwildcardmulti - GlobalSign-企业型OV（通配符多域名）
34. sv_ssl_cost_globalsign_ovwildcard - GlobalSign-企业型OV（泛域名）
35. sv_ssl_cost_globalsign_ovmultidomain - GlobalSign-企业型OV（多域名）
36. sv_ssl_cost_globalsign_ov - GlobalSign-企业型OV（单域名）
37. sv_ssl_cost_trustasia_ovwildcardmulti - TrustAsia-企业型OV（通配符多域名）
38. sv_ssl_cost_trustasia_ovwildcard - TrustAsia-企业型OV（泛域名）
39. sv_ssl_cost_trustasia_ovmultidomain - TrustAsia-企业型OV（多域名）
40. sv_ssl_cost_trustasia_ov - TrustAsia-企业型OV（单域名）
41. sv_ssl_cost_geotrust_ovwildcard - GeoTrust-企业型OV（泛域名）
42. sv_ssl_cost_geotrust_ov - GeoTrust-企业型OV（单域名）
43. sv_ssl_cost_symantec_ovwildcard - SecureSite-企业型OV（泛域名）
44. sv_ssl_cost_symantec_ovmultidomain - SecureSite-企业型OV（多域名）
45. sv_ssl_cost_symantec_ov - SecureSite-企业型OV（单域名）
46. sv_ssl_cost_dnspod_evmultidomain - DNSPod-国密增强型证书（多域名）
47. sv_ssl_cost_dnspod_ev - DNSPod-国密增强型证书
48. sv_ssl_cost_dnspod_ovwildcard - DNSPod-国密企业型证书（通配符）
49. sv_ssl_cost_dnspod_ovmultidomain - DNSPod-国密企业型证书（多域名）
50. sv_ssl_cost_dnspod_ov - DNSPod-国密企业型证书
51. sv_ssl_cost_dnspod_dvwildcard - DNSPod-国密域名型证书（通配符）
52. sv_ssl_cost_dnspod_dvmultidomain - DNSPod-国密域名型证书（多域名）
53. sv_ssl_cost_dnspod_dv - DNSPod-国密域名型证书
54. sv_ssl_cost_wotrus_evmultidomain - WoTrus-增强型证书（多域名）
55. sv_ssl_cost_wotrus_ev - WoTrus-增强型证书
56. sv_ssl_cost_wotrus_ovwildcard - WoTrus-企业型证书（通配符）
57. sv_ssl_cost_wotrus_ovmultidomain - WoTrus-企业型证书（多域名）
58. sv_ssl_cost_wotrus_ov - WoTrus-企业型证书
59. sv_ssl_cost_wotrus_dvwildcard - WoTrus-域名型证书（通配符）
60. sv_ssl_cost_wotrus_dvmultidomain - WoTrus-域名型证书（多域名）
61. sv_ssl_cost_wotrus_dv - WoTrus-域名型证书
    */
    @SerializedName("PriceKey")
    @Expose
    private String PriceKey;

    /**
     * Get 证书产品PID，以下是对每个PID及其对应的证书文字说明：
1. 1022451 - CFCA-增强型(EV)SSL证书
2. 1022449 - CFCA-企业型(OV) SSL证书(通配符)
3. 1022447 - CFCA-企业型(OV)SSL证书
4. 1014028 - DNSPod亚信国密-企业型(OV)通配符证书
5. 1014030 - DNSPod亚信国密-企业型(OV)多域名证书
6. 1014026 - DNSPod亚信国密-企业型(OV)证书
7. 1014022 - DNSPod亚信国密-域名型(DV)通配符证书
8. 1014024 - DNSPod亚信国密-域名型(DV)多域名证书
9. 1014020 - DNSPod亚信国密-域名型(DV)证书
10. 1013949 - DNSPod SSL 域名型SSL证书(C1)
11. 1013953 - DNSPod SSL域名型多域名SSL证书(C1)
12. 1013951 - DNSPod-SSL域名型DV（泛域名）
13. 1013955 - DNSPod 企业型SSL证书(C1)
14. 1013959 - DNSPod 企业型多域名SSL证书(C1)
15. 1013957 - DNSPod 企业型通配符SSL证书(C1)
16. 1013961 - DNSPod 增强型 SSL 证书(C1)
17. 1013963 - DNSPod 增强型多域名SSL证书(C1)
18. 1005919 - TrustAsia-域名型DV（通配符多域名）
19. 1013882 - SecureSite-增强型专业版EVPro（多域名）
20. 1018559 - SecureSite-增强型专业版EVPro（单域名）
21. 1013910 - GlobalSign-增强型EV（多域名）
22. 1013904 - GlobalSign-增强型EV（单域名）
23. 1013898 - TrustAsia-增强型EV（多域名）
24. 1013888 - TrustAsia-增强型EV（单域名）
25. 1013886 - GeoTrust-增强型EV（多域名）
26. 1018529 - GeoTrust-增强型EV（单域名）
27. 1013880 - SecureSite-增强型EV（多域名）
28. 1018557 - SecureSite-增强型EV（单域名）
29. 1018586 - TrustAsia-域名型DV（泛域名）
30. 1018584 - TrustAsia-域名型DV（多域名）
31. 1013878 - SecureSite-企业型专业版OV Pro（多域名）
32. 1018582 - SecureSite-企业型专业版OV Pro（单域名）
33. 1013908 - GlobalSign-企业型OV（通配符多域名）
34. 1013902 - GlobalSign-企业型OV（泛域名）
35. 1013906 - GlobalSign-企业型OV（多域名）
36. 1013900 - GlobalSign-企业型OV（单域名）
37. 1013896 - TrustAsia-企业型OV（通配符多域名）
38. 1013892 - TrustAsia-企业型OV（泛域名）
39. 1013894 - TrustAsia-企业型OV（多域名）
40. 1013890 - TrustAsia-企业型OV（单域名）
41. 1004360 - GeoTrust-企业型OV（泛域名）
42. 1013884 - GeoTrust-企业型OV（单域名）
43. 1013874 - SecureSite-企业型OV（泛域名）
44. 1013876 - SecureSite-企业型OV（多域名）
45. 1018580 - SecureSite-企业型OV（单域名）
46. 1004460 - DNSPod-国密增强型证书（多域名）
47. 1004458 - DNSPod-国密增强型证书
48. 1004370 - DNSPod-国密企业型证书（通配符）
49. 1004368 - DNSPod-国密企业型证书（多域名）
50. 1004366 - DNSPod-国密企业型证书
51. 1004362 - DNSPod-国密域名型证书（通配符）
52. 1004364 - DNSPod-国密域名型证书（多域名）
53. 1004358 - DNSPod-国密域名型证书
54. 1004456 - WoTrus-增强型证书（多域名）
55. 1004454 - WoTrus-增强型证书
56. 1004168 - WoTrus-企业型证书（通配符）
57. 1004166 - WoTrus-企业型证书（多域名）
58. 1004164 - WoTrus-企业型证书
59. 1004159 - WoTrus-域名型证书（通配符）
60. 1004161 - WoTrus-域名型证书（多域名）
61. 1004157 - WoTrus-域名型证书 
     * @return ProductPid 证书产品PID，以下是对每个PID及其对应的证书文字说明：
1. 1022451 - CFCA-增强型(EV)SSL证书
2. 1022449 - CFCA-企业型(OV) SSL证书(通配符)
3. 1022447 - CFCA-企业型(OV)SSL证书
4. 1014028 - DNSPod亚信国密-企业型(OV)通配符证书
5. 1014030 - DNSPod亚信国密-企业型(OV)多域名证书
6. 1014026 - DNSPod亚信国密-企业型(OV)证书
7. 1014022 - DNSPod亚信国密-域名型(DV)通配符证书
8. 1014024 - DNSPod亚信国密-域名型(DV)多域名证书
9. 1014020 - DNSPod亚信国密-域名型(DV)证书
10. 1013949 - DNSPod SSL 域名型SSL证书(C1)
11. 1013953 - DNSPod SSL域名型多域名SSL证书(C1)
12. 1013951 - DNSPod-SSL域名型DV（泛域名）
13. 1013955 - DNSPod 企业型SSL证书(C1)
14. 1013959 - DNSPod 企业型多域名SSL证书(C1)
15. 1013957 - DNSPod 企业型通配符SSL证书(C1)
16. 1013961 - DNSPod 增强型 SSL 证书(C1)
17. 1013963 - DNSPod 增强型多域名SSL证书(C1)
18. 1005919 - TrustAsia-域名型DV（通配符多域名）
19. 1013882 - SecureSite-增强型专业版EVPro（多域名）
20. 1018559 - SecureSite-增强型专业版EVPro（单域名）
21. 1013910 - GlobalSign-增强型EV（多域名）
22. 1013904 - GlobalSign-增强型EV（单域名）
23. 1013898 - TrustAsia-增强型EV（多域名）
24. 1013888 - TrustAsia-增强型EV（单域名）
25. 1013886 - GeoTrust-增强型EV（多域名）
26. 1018529 - GeoTrust-增强型EV（单域名）
27. 1013880 - SecureSite-增强型EV（多域名）
28. 1018557 - SecureSite-增强型EV（单域名）
29. 1018586 - TrustAsia-域名型DV（泛域名）
30. 1018584 - TrustAsia-域名型DV（多域名）
31. 1013878 - SecureSite-企业型专业版OV Pro（多域名）
32. 1018582 - SecureSite-企业型专业版OV Pro（单域名）
33. 1013908 - GlobalSign-企业型OV（通配符多域名）
34. 1013902 - GlobalSign-企业型OV（泛域名）
35. 1013906 - GlobalSign-企业型OV（多域名）
36. 1013900 - GlobalSign-企业型OV（单域名）
37. 1013896 - TrustAsia-企业型OV（通配符多域名）
38. 1013892 - TrustAsia-企业型OV（泛域名）
39. 1013894 - TrustAsia-企业型OV（多域名）
40. 1013890 - TrustAsia-企业型OV（单域名）
41. 1004360 - GeoTrust-企业型OV（泛域名）
42. 1013884 - GeoTrust-企业型OV（单域名）
43. 1013874 - SecureSite-企业型OV（泛域名）
44. 1013876 - SecureSite-企业型OV（多域名）
45. 1018580 - SecureSite-企业型OV（单域名）
46. 1004460 - DNSPod-国密增强型证书（多域名）
47. 1004458 - DNSPod-国密增强型证书
48. 1004370 - DNSPod-国密企业型证书（通配符）
49. 1004368 - DNSPod-国密企业型证书（多域名）
50. 1004366 - DNSPod-国密企业型证书
51. 1004362 - DNSPod-国密域名型证书（通配符）
52. 1004364 - DNSPod-国密域名型证书（多域名）
53. 1004358 - DNSPod-国密域名型证书
54. 1004456 - WoTrus-增强型证书（多域名）
55. 1004454 - WoTrus-增强型证书
56. 1004168 - WoTrus-企业型证书（通配符）
57. 1004166 - WoTrus-企业型证书（多域名）
58. 1004164 - WoTrus-企业型证书
59. 1004159 - WoTrus-域名型证书（通配符）
60. 1004161 - WoTrus-域名型证书（多域名）
61. 1004157 - WoTrus-域名型证书
     */
    public Long getProductPid() {
        return this.ProductPid;
    }

    /**
     * Set 证书产品PID，以下是对每个PID及其对应的证书文字说明：
1. 1022451 - CFCA-增强型(EV)SSL证书
2. 1022449 - CFCA-企业型(OV) SSL证书(通配符)
3. 1022447 - CFCA-企业型(OV)SSL证书
4. 1014028 - DNSPod亚信国密-企业型(OV)通配符证书
5. 1014030 - DNSPod亚信国密-企业型(OV)多域名证书
6. 1014026 - DNSPod亚信国密-企业型(OV)证书
7. 1014022 - DNSPod亚信国密-域名型(DV)通配符证书
8. 1014024 - DNSPod亚信国密-域名型(DV)多域名证书
9. 1014020 - DNSPod亚信国密-域名型(DV)证书
10. 1013949 - DNSPod SSL 域名型SSL证书(C1)
11. 1013953 - DNSPod SSL域名型多域名SSL证书(C1)
12. 1013951 - DNSPod-SSL域名型DV（泛域名）
13. 1013955 - DNSPod 企业型SSL证书(C1)
14. 1013959 - DNSPod 企业型多域名SSL证书(C1)
15. 1013957 - DNSPod 企业型通配符SSL证书(C1)
16. 1013961 - DNSPod 增强型 SSL 证书(C1)
17. 1013963 - DNSPod 增强型多域名SSL证书(C1)
18. 1005919 - TrustAsia-域名型DV（通配符多域名）
19. 1013882 - SecureSite-增强型专业版EVPro（多域名）
20. 1018559 - SecureSite-增强型专业版EVPro（单域名）
21. 1013910 - GlobalSign-增强型EV（多域名）
22. 1013904 - GlobalSign-增强型EV（单域名）
23. 1013898 - TrustAsia-增强型EV（多域名）
24. 1013888 - TrustAsia-增强型EV（单域名）
25. 1013886 - GeoTrust-增强型EV（多域名）
26. 1018529 - GeoTrust-增强型EV（单域名）
27. 1013880 - SecureSite-增强型EV（多域名）
28. 1018557 - SecureSite-增强型EV（单域名）
29. 1018586 - TrustAsia-域名型DV（泛域名）
30. 1018584 - TrustAsia-域名型DV（多域名）
31. 1013878 - SecureSite-企业型专业版OV Pro（多域名）
32. 1018582 - SecureSite-企业型专业版OV Pro（单域名）
33. 1013908 - GlobalSign-企业型OV（通配符多域名）
34. 1013902 - GlobalSign-企业型OV（泛域名）
35. 1013906 - GlobalSign-企业型OV（多域名）
36. 1013900 - GlobalSign-企业型OV（单域名）
37. 1013896 - TrustAsia-企业型OV（通配符多域名）
38. 1013892 - TrustAsia-企业型OV（泛域名）
39. 1013894 - TrustAsia-企业型OV（多域名）
40. 1013890 - TrustAsia-企业型OV（单域名）
41. 1004360 - GeoTrust-企业型OV（泛域名）
42. 1013884 - GeoTrust-企业型OV（单域名）
43. 1013874 - SecureSite-企业型OV（泛域名）
44. 1013876 - SecureSite-企业型OV（多域名）
45. 1018580 - SecureSite-企业型OV（单域名）
46. 1004460 - DNSPod-国密增强型证书（多域名）
47. 1004458 - DNSPod-国密增强型证书
48. 1004370 - DNSPod-国密企业型证书（通配符）
49. 1004368 - DNSPod-国密企业型证书（多域名）
50. 1004366 - DNSPod-国密企业型证书
51. 1004362 - DNSPod-国密域名型证书（通配符）
52. 1004364 - DNSPod-国密域名型证书（多域名）
53. 1004358 - DNSPod-国密域名型证书
54. 1004456 - WoTrus-增强型证书（多域名）
55. 1004454 - WoTrus-增强型证书
56. 1004168 - WoTrus-企业型证书（通配符）
57. 1004166 - WoTrus-企业型证书（多域名）
58. 1004164 - WoTrus-企业型证书
59. 1004159 - WoTrus-域名型证书（通配符）
60. 1004161 - WoTrus-域名型证书（多域名）
61. 1004157 - WoTrus-域名型证书
     * @param ProductPid 证书产品PID，以下是对每个PID及其对应的证书文字说明：
1. 1022451 - CFCA-增强型(EV)SSL证书
2. 1022449 - CFCA-企业型(OV) SSL证书(通配符)
3. 1022447 - CFCA-企业型(OV)SSL证书
4. 1014028 - DNSPod亚信国密-企业型(OV)通配符证书
5. 1014030 - DNSPod亚信国密-企业型(OV)多域名证书
6. 1014026 - DNSPod亚信国密-企业型(OV)证书
7. 1014022 - DNSPod亚信国密-域名型(DV)通配符证书
8. 1014024 - DNSPod亚信国密-域名型(DV)多域名证书
9. 1014020 - DNSPod亚信国密-域名型(DV)证书
10. 1013949 - DNSPod SSL 域名型SSL证书(C1)
11. 1013953 - DNSPod SSL域名型多域名SSL证书(C1)
12. 1013951 - DNSPod-SSL域名型DV（泛域名）
13. 1013955 - DNSPod 企业型SSL证书(C1)
14. 1013959 - DNSPod 企业型多域名SSL证书(C1)
15. 1013957 - DNSPod 企业型通配符SSL证书(C1)
16. 1013961 - DNSPod 增强型 SSL 证书(C1)
17. 1013963 - DNSPod 增强型多域名SSL证书(C1)
18. 1005919 - TrustAsia-域名型DV（通配符多域名）
19. 1013882 - SecureSite-增强型专业版EVPro（多域名）
20. 1018559 - SecureSite-增强型专业版EVPro（单域名）
21. 1013910 - GlobalSign-增强型EV（多域名）
22. 1013904 - GlobalSign-增强型EV（单域名）
23. 1013898 - TrustAsia-增强型EV（多域名）
24. 1013888 - TrustAsia-增强型EV（单域名）
25. 1013886 - GeoTrust-增强型EV（多域名）
26. 1018529 - GeoTrust-增强型EV（单域名）
27. 1013880 - SecureSite-增强型EV（多域名）
28. 1018557 - SecureSite-增强型EV（单域名）
29. 1018586 - TrustAsia-域名型DV（泛域名）
30. 1018584 - TrustAsia-域名型DV（多域名）
31. 1013878 - SecureSite-企业型专业版OV Pro（多域名）
32. 1018582 - SecureSite-企业型专业版OV Pro（单域名）
33. 1013908 - GlobalSign-企业型OV（通配符多域名）
34. 1013902 - GlobalSign-企业型OV（泛域名）
35. 1013906 - GlobalSign-企业型OV（多域名）
36. 1013900 - GlobalSign-企业型OV（单域名）
37. 1013896 - TrustAsia-企业型OV（通配符多域名）
38. 1013892 - TrustAsia-企业型OV（泛域名）
39. 1013894 - TrustAsia-企业型OV（多域名）
40. 1013890 - TrustAsia-企业型OV（单域名）
41. 1004360 - GeoTrust-企业型OV（泛域名）
42. 1013884 - GeoTrust-企业型OV（单域名）
43. 1013874 - SecureSite-企业型OV（泛域名）
44. 1013876 - SecureSite-企业型OV（多域名）
45. 1018580 - SecureSite-企业型OV（单域名）
46. 1004460 - DNSPod-国密增强型证书（多域名）
47. 1004458 - DNSPod-国密增强型证书
48. 1004370 - DNSPod-国密企业型证书（通配符）
49. 1004368 - DNSPod-国密企业型证书（多域名）
50. 1004366 - DNSPod-国密企业型证书
51. 1004362 - DNSPod-国密域名型证书（通配符）
52. 1004364 - DNSPod-国密域名型证书（多域名）
53. 1004358 - DNSPod-国密域名型证书
54. 1004456 - WoTrus-增强型证书（多域名）
55. 1004454 - WoTrus-增强型证书
56. 1004168 - WoTrus-企业型证书（通配符）
57. 1004166 - WoTrus-企业型证书（多域名）
58. 1004164 - WoTrus-企业型证书
59. 1004159 - WoTrus-域名型证书（通配符）
60. 1004161 - WoTrus-域名型证书（多域名）
61. 1004157 - WoTrus-域名型证书
     */
    public void setProductPid(Long ProductPid) {
        this.ProductPid = ProductPid;
    }

    /**
     * Get 要消耗的权益包ID。 
     * @return PackageIds 要消耗的权益包ID。
     */
    public String [] getPackageIds() {
        return this.PackageIds;
    }

    /**
     * Set 要消耗的权益包ID。
     * @param PackageIds 要消耗的权益包ID。
     */
    public void setPackageIds(String [] PackageIds) {
        this.PackageIds = PackageIds;
    }

    /**
     * Get 证书域名数量。 
     * @return DomainCount 证书域名数量。
     */
    public String getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 证书域名数量。
     * @param DomainCount 证书域名数量。
     */
    public void setDomainCount(String DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 多年期证书年限。 
     * @return Period 多年期证书年限。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 多年期证书年限。
     * @param Period 多年期证书年限。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 要续费的原证书ID（续费时填写）。 
     * @return OldCertificateId 要续费的原证书ID（续费时填写）。
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 要续费的原证书ID（续费时填写）。
     * @param OldCertificateId 要续费的原证书ID（续费时填写）。
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 续费时CSR生成方式（original、upload、online）。 
     * @return RenewGenCsrMethod 续费时CSR生成方式（original、upload、online）。
     */
    public String getRenewGenCsrMethod() {
        return this.RenewGenCsrMethod;
    }

    /**
     * Set 续费时CSR生成方式（original、upload、online）。
     * @param RenewGenCsrMethod 续费时CSR生成方式（original、upload、online）。
     */
    public void setRenewGenCsrMethod(String RenewGenCsrMethod) {
        this.RenewGenCsrMethod = RenewGenCsrMethod;
    }

    /**
     * Get 续费时选择上传CSR时填写CSR。 
     * @return RenewCsr 续费时选择上传CSR时填写CSR。
     */
    public String getRenewCsr() {
        return this.RenewCsr;
    }

    /**
     * Set 续费时选择上传CSR时填写CSR。
     * @param RenewCsr 续费时选择上传CSR时填写CSR。
     */
    public void setRenewCsr(String RenewCsr) {
        this.RenewCsr = RenewCsr;
    }

    /**
     * Get 续费证书CSR的算法类型：RSA,ECC,SM2 
     * @return RenewAlgorithmType 续费证书CSR的算法类型：RSA,ECC,SM2
     */
    public String getRenewAlgorithmType() {
        return this.RenewAlgorithmType;
    }

    /**
     * Set 续费证书CSR的算法类型：RSA,ECC,SM2
     * @param RenewAlgorithmType 续费证书CSR的算法类型：RSA,ECC,SM2
     */
    public void setRenewAlgorithmType(String RenewAlgorithmType) {
        this.RenewAlgorithmType = RenewAlgorithmType;
    }

    /**
     * Get 续费证书CSR的算法参数:2048,4096,prime256v1 
     * @return RenewAlgorithmParam 续费证书CSR的算法参数:2048,4096,prime256v1
     */
    public String getRenewAlgorithmParam() {
        return this.RenewAlgorithmParam;
    }

    /**
     * Set 续费证书CSR的算法参数:2048,4096,prime256v1
     * @param RenewAlgorithmParam 续费证书CSR的算法参数:2048,4096,prime256v1
     */
    public void setRenewAlgorithmParam(String RenewAlgorithmParam) {
        this.RenewAlgorithmParam = RenewAlgorithmParam;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 续费证书的私钥密码。 
     * @return RenewKeyPass 续费证书的私钥密码。
     */
    public String getRenewKeyPass() {
        return this.RenewKeyPass;
    }

    /**
     * Set 续费证书的私钥密码。
     * @param RenewKeyPass 续费证书的私钥密码。
     */
    public void setRenewKeyPass(String RenewKeyPass) {
        this.RenewKeyPass = RenewKeyPass;
    }

    /**
     * Get 批量购买证书时预填写的域名。 
     * @return DomainNames 批量购买证书时预填写的域名。
     */
    public String getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 批量购买证书时预填写的域名。
     * @param DomainNames 批量购买证书时预填写的域名。
     */
    public void setDomainNames(String DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get 批量购买证书数量。 
     * @return CertificateCount 批量购买证书数量。
     */
    public Long getCertificateCount() {
        return this.CertificateCount;
    }

    /**
     * Set 批量购买证书数量。
     * @param CertificateCount 批量购买证书数量。
     */
    public void setCertificateCount(Long CertificateCount) {
        this.CertificateCount = CertificateCount;
    }

    /**
     * Get 预填写的管理人ID。 
     * @return ManagerId 预填写的管理人ID。
     */
    public Long getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 预填写的管理人ID。
     * @param ManagerId 预填写的管理人ID。
     */
    public void setManagerId(Long ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 预填写的公司ID。 
     * @return CompanyId 预填写的公司ID。
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 预填写的公司ID。
     * @param CompanyId 预填写的公司ID。
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 验证方式 
     * @return VerifyType 验证方式
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证方式
     * @param VerifyType 验证方式
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 询价参数，以下是对每个询价参数及其对应的证书文字说明：
1. sv_ssl_cost_cfca_ca_ev - CFCA-增强型(EV)SSL证书
2. sv_ssl_cost_cfca_ca_ovwildcard - CFCA-企业型(OV) SSL证书(通配符)
3. sv_ssl_cost_cfca_ca_ov - CFCA-企业型(OV)SSL证书
4. sv_ssl_cost_dnspod_ca_sm2_ovwildcard - DNSPod亚信国密-企业型(OV)通配符证书
5. sv_ssl_cost_dnspod_ca_sm2_ovmultidomain - DNSPod亚信国密-企业型(OV)多域名证书
6. sv_ssl_cost_dnspod_ca_sm2_ov - DNSPod亚信国密-企业型(OV)证书
7. sv_ssl_cost_dnspod_ca_sm2_dvwildcard - DNSPod亚信国密-域名型(DV)通配符证书
8. sv_ssl_cost_dnspod_ca_sm2_dvmultidomain - DNSPod亚信国密-域名型(DV)多域名证书
9. sv_ssl_cost_dnspod_ca_sm2_dv - DNSPod亚信国密-域名型(DV)证书
10. sv_ssl_cost_dnspod_ca_dv - DNSPod SSL 域名型SSL证书(C1)
11. sv_ssl_cost_dnspod_ca_dvmultidomain - DNSPod SSL域名型多域名SSL证书(C1)
12. sv_ssl_cost_dnspod_ca_dvwildcard - DNSPod-SSL域名型DV（泛域名）
13. sv_ssl_cost_dnspod_ca_ov - DNSPod 企业型SSL证书(C1)
14. sv_ssl_cost_dnspod_ca_ovmultidomain - DNSPod 企业型多域名SSL证书(C1)
15. sv_ssl_cost_dnspod_ca_ovwildcard - DNSPod 企业型通配符SSL证书(C1)
16. sv_ssl_cost_dnspod_ca_ev - DNSPod 增强型 SSL 证书(C1)
17. sv_ssl_cost_dnspod_ca_evmultidomain - DNSPod 增强型多域名SSL证书(C1)
18. sv_ssl_cost_trustasia_dvwildcardmulti - TrustAsia-域名型DV（通配符多域名）
19. sv_ssl_cost_securesiteevpromul_sh - SecureSite-增强型专业版EVPro（多域名）
20. sv_ssl_cost_symantec_evpro - SecureSite-增强型专业版EVPro（单域名）
21. sv_ssl_cost_globalsign_ev_mul_sh - GlobalSign-增强型EV（多域名）
22. sv_ssl_cost_globalsign_ev - GlobalSign-增强型EV（单域名）
23. sv_ssl_cost_trustasia_evmultidomain - TrustAsia-增强型EV（多域名）
24. sv_ssl_cost_trustasia_ev - TrustAsia-增强型EV（单域名）
25. sv_ssl_cost_geotrust_evmultidomain - GeoTrust-增强型EV（多域名）
26. sv_ssl_cost_geotrust_ev - GeoTrust-增强型EV（单域名）
27. sv_ssl_cost_symantec_evmultidomain - SecureSite-增强型EV（多域名）
28. sv_ssl_cost_symantec_ev - SecureSite-增强型EV（单域名）
29. sv_ssl_cost_trustasia_dvwildcard - TrustAsia-域名型DV（泛域名）
30. sv_ssl_cost_trustasia_dvmultidomain - TrustAsia-域名型DV（多域名）
31. sv_ssl_cost_symantec_ovpromultidomain - SecureSite-企业型专业版OV Pro（多域名）
32. sv_ssl_cost_symantec_ovpro - SecureSite-企业型专业版OV Pro（单域名）
33. sv_ssl_cost_globalsign_ovwildcardmulti - GlobalSign-企业型OV（通配符多域名）
34. sv_ssl_cost_globalsign_ovwildcard - GlobalSign-企业型OV（泛域名）
35. sv_ssl_cost_globalsign_ovmultidomain - GlobalSign-企业型OV（多域名）
36. sv_ssl_cost_globalsign_ov - GlobalSign-企业型OV（单域名）
37. sv_ssl_cost_trustasia_ovwildcardmulti - TrustAsia-企业型OV（通配符多域名）
38. sv_ssl_cost_trustasia_ovwildcard - TrustAsia-企业型OV（泛域名）
39. sv_ssl_cost_trustasia_ovmultidomain - TrustAsia-企业型OV（多域名）
40. sv_ssl_cost_trustasia_ov - TrustAsia-企业型OV（单域名）
41. sv_ssl_cost_geotrust_ovwildcard - GeoTrust-企业型OV（泛域名）
42. sv_ssl_cost_geotrust_ov - GeoTrust-企业型OV（单域名）
43. sv_ssl_cost_symantec_ovwildcard - SecureSite-企业型OV（泛域名）
44. sv_ssl_cost_symantec_ovmultidomain - SecureSite-企业型OV（多域名）
45. sv_ssl_cost_symantec_ov - SecureSite-企业型OV（单域名）
46. sv_ssl_cost_dnspod_evmultidomain - DNSPod-国密增强型证书（多域名）
47. sv_ssl_cost_dnspod_ev - DNSPod-国密增强型证书
48. sv_ssl_cost_dnspod_ovwildcard - DNSPod-国密企业型证书（通配符）
49. sv_ssl_cost_dnspod_ovmultidomain - DNSPod-国密企业型证书（多域名）
50. sv_ssl_cost_dnspod_ov - DNSPod-国密企业型证书
51. sv_ssl_cost_dnspod_dvwildcard - DNSPod-国密域名型证书（通配符）
52. sv_ssl_cost_dnspod_dvmultidomain - DNSPod-国密域名型证书（多域名）
53. sv_ssl_cost_dnspod_dv - DNSPod-国密域名型证书
54. sv_ssl_cost_wotrus_evmultidomain - WoTrus-增强型证书（多域名）
55. sv_ssl_cost_wotrus_ev - WoTrus-增强型证书
56. sv_ssl_cost_wotrus_ovwildcard - WoTrus-企业型证书（通配符）
57. sv_ssl_cost_wotrus_ovmultidomain - WoTrus-企业型证书（多域名）
58. sv_ssl_cost_wotrus_ov - WoTrus-企业型证书
59. sv_ssl_cost_wotrus_dvwildcard - WoTrus-域名型证书（通配符）
60. sv_ssl_cost_wotrus_dvmultidomain - WoTrus-域名型证书（多域名）
61. sv_ssl_cost_wotrus_dv - WoTrus-域名型证书 
     * @return PriceKey 询价参数，以下是对每个询价参数及其对应的证书文字说明：
1. sv_ssl_cost_cfca_ca_ev - CFCA-增强型(EV)SSL证书
2. sv_ssl_cost_cfca_ca_ovwildcard - CFCA-企业型(OV) SSL证书(通配符)
3. sv_ssl_cost_cfca_ca_ov - CFCA-企业型(OV)SSL证书
4. sv_ssl_cost_dnspod_ca_sm2_ovwildcard - DNSPod亚信国密-企业型(OV)通配符证书
5. sv_ssl_cost_dnspod_ca_sm2_ovmultidomain - DNSPod亚信国密-企业型(OV)多域名证书
6. sv_ssl_cost_dnspod_ca_sm2_ov - DNSPod亚信国密-企业型(OV)证书
7. sv_ssl_cost_dnspod_ca_sm2_dvwildcard - DNSPod亚信国密-域名型(DV)通配符证书
8. sv_ssl_cost_dnspod_ca_sm2_dvmultidomain - DNSPod亚信国密-域名型(DV)多域名证书
9. sv_ssl_cost_dnspod_ca_sm2_dv - DNSPod亚信国密-域名型(DV)证书
10. sv_ssl_cost_dnspod_ca_dv - DNSPod SSL 域名型SSL证书(C1)
11. sv_ssl_cost_dnspod_ca_dvmultidomain - DNSPod SSL域名型多域名SSL证书(C1)
12. sv_ssl_cost_dnspod_ca_dvwildcard - DNSPod-SSL域名型DV（泛域名）
13. sv_ssl_cost_dnspod_ca_ov - DNSPod 企业型SSL证书(C1)
14. sv_ssl_cost_dnspod_ca_ovmultidomain - DNSPod 企业型多域名SSL证书(C1)
15. sv_ssl_cost_dnspod_ca_ovwildcard - DNSPod 企业型通配符SSL证书(C1)
16. sv_ssl_cost_dnspod_ca_ev - DNSPod 增强型 SSL 证书(C1)
17. sv_ssl_cost_dnspod_ca_evmultidomain - DNSPod 增强型多域名SSL证书(C1)
18. sv_ssl_cost_trustasia_dvwildcardmulti - TrustAsia-域名型DV（通配符多域名）
19. sv_ssl_cost_securesiteevpromul_sh - SecureSite-增强型专业版EVPro（多域名）
20. sv_ssl_cost_symantec_evpro - SecureSite-增强型专业版EVPro（单域名）
21. sv_ssl_cost_globalsign_ev_mul_sh - GlobalSign-增强型EV（多域名）
22. sv_ssl_cost_globalsign_ev - GlobalSign-增强型EV（单域名）
23. sv_ssl_cost_trustasia_evmultidomain - TrustAsia-增强型EV（多域名）
24. sv_ssl_cost_trustasia_ev - TrustAsia-增强型EV（单域名）
25. sv_ssl_cost_geotrust_evmultidomain - GeoTrust-增强型EV（多域名）
26. sv_ssl_cost_geotrust_ev - GeoTrust-增强型EV（单域名）
27. sv_ssl_cost_symantec_evmultidomain - SecureSite-增强型EV（多域名）
28. sv_ssl_cost_symantec_ev - SecureSite-增强型EV（单域名）
29. sv_ssl_cost_trustasia_dvwildcard - TrustAsia-域名型DV（泛域名）
30. sv_ssl_cost_trustasia_dvmultidomain - TrustAsia-域名型DV（多域名）
31. sv_ssl_cost_symantec_ovpromultidomain - SecureSite-企业型专业版OV Pro（多域名）
32. sv_ssl_cost_symantec_ovpro - SecureSite-企业型专业版OV Pro（单域名）
33. sv_ssl_cost_globalsign_ovwildcardmulti - GlobalSign-企业型OV（通配符多域名）
34. sv_ssl_cost_globalsign_ovwildcard - GlobalSign-企业型OV（泛域名）
35. sv_ssl_cost_globalsign_ovmultidomain - GlobalSign-企业型OV（多域名）
36. sv_ssl_cost_globalsign_ov - GlobalSign-企业型OV（单域名）
37. sv_ssl_cost_trustasia_ovwildcardmulti - TrustAsia-企业型OV（通配符多域名）
38. sv_ssl_cost_trustasia_ovwildcard - TrustAsia-企业型OV（泛域名）
39. sv_ssl_cost_trustasia_ovmultidomain - TrustAsia-企业型OV（多域名）
40. sv_ssl_cost_trustasia_ov - TrustAsia-企业型OV（单域名）
41. sv_ssl_cost_geotrust_ovwildcard - GeoTrust-企业型OV（泛域名）
42. sv_ssl_cost_geotrust_ov - GeoTrust-企业型OV（单域名）
43. sv_ssl_cost_symantec_ovwildcard - SecureSite-企业型OV（泛域名）
44. sv_ssl_cost_symantec_ovmultidomain - SecureSite-企业型OV（多域名）
45. sv_ssl_cost_symantec_ov - SecureSite-企业型OV（单域名）
46. sv_ssl_cost_dnspod_evmultidomain - DNSPod-国密增强型证书（多域名）
47. sv_ssl_cost_dnspod_ev - DNSPod-国密增强型证书
48. sv_ssl_cost_dnspod_ovwildcard - DNSPod-国密企业型证书（通配符）
49. sv_ssl_cost_dnspod_ovmultidomain - DNSPod-国密企业型证书（多域名）
50. sv_ssl_cost_dnspod_ov - DNSPod-国密企业型证书
51. sv_ssl_cost_dnspod_dvwildcard - DNSPod-国密域名型证书（通配符）
52. sv_ssl_cost_dnspod_dvmultidomain - DNSPod-国密域名型证书（多域名）
53. sv_ssl_cost_dnspod_dv - DNSPod-国密域名型证书
54. sv_ssl_cost_wotrus_evmultidomain - WoTrus-增强型证书（多域名）
55. sv_ssl_cost_wotrus_ev - WoTrus-增强型证书
56. sv_ssl_cost_wotrus_ovwildcard - WoTrus-企业型证书（通配符）
57. sv_ssl_cost_wotrus_ovmultidomain - WoTrus-企业型证书（多域名）
58. sv_ssl_cost_wotrus_ov - WoTrus-企业型证书
59. sv_ssl_cost_wotrus_dvwildcard - WoTrus-域名型证书（通配符）
60. sv_ssl_cost_wotrus_dvmultidomain - WoTrus-域名型证书（多域名）
61. sv_ssl_cost_wotrus_dv - WoTrus-域名型证书
     */
    public String getPriceKey() {
        return this.PriceKey;
    }

    /**
     * Set 询价参数，以下是对每个询价参数及其对应的证书文字说明：
1. sv_ssl_cost_cfca_ca_ev - CFCA-增强型(EV)SSL证书
2. sv_ssl_cost_cfca_ca_ovwildcard - CFCA-企业型(OV) SSL证书(通配符)
3. sv_ssl_cost_cfca_ca_ov - CFCA-企业型(OV)SSL证书
4. sv_ssl_cost_dnspod_ca_sm2_ovwildcard - DNSPod亚信国密-企业型(OV)通配符证书
5. sv_ssl_cost_dnspod_ca_sm2_ovmultidomain - DNSPod亚信国密-企业型(OV)多域名证书
6. sv_ssl_cost_dnspod_ca_sm2_ov - DNSPod亚信国密-企业型(OV)证书
7. sv_ssl_cost_dnspod_ca_sm2_dvwildcard - DNSPod亚信国密-域名型(DV)通配符证书
8. sv_ssl_cost_dnspod_ca_sm2_dvmultidomain - DNSPod亚信国密-域名型(DV)多域名证书
9. sv_ssl_cost_dnspod_ca_sm2_dv - DNSPod亚信国密-域名型(DV)证书
10. sv_ssl_cost_dnspod_ca_dv - DNSPod SSL 域名型SSL证书(C1)
11. sv_ssl_cost_dnspod_ca_dvmultidomain - DNSPod SSL域名型多域名SSL证书(C1)
12. sv_ssl_cost_dnspod_ca_dvwildcard - DNSPod-SSL域名型DV（泛域名）
13. sv_ssl_cost_dnspod_ca_ov - DNSPod 企业型SSL证书(C1)
14. sv_ssl_cost_dnspod_ca_ovmultidomain - DNSPod 企业型多域名SSL证书(C1)
15. sv_ssl_cost_dnspod_ca_ovwildcard - DNSPod 企业型通配符SSL证书(C1)
16. sv_ssl_cost_dnspod_ca_ev - DNSPod 增强型 SSL 证书(C1)
17. sv_ssl_cost_dnspod_ca_evmultidomain - DNSPod 增强型多域名SSL证书(C1)
18. sv_ssl_cost_trustasia_dvwildcardmulti - TrustAsia-域名型DV（通配符多域名）
19. sv_ssl_cost_securesiteevpromul_sh - SecureSite-增强型专业版EVPro（多域名）
20. sv_ssl_cost_symantec_evpro - SecureSite-增强型专业版EVPro（单域名）
21. sv_ssl_cost_globalsign_ev_mul_sh - GlobalSign-增强型EV（多域名）
22. sv_ssl_cost_globalsign_ev - GlobalSign-增强型EV（单域名）
23. sv_ssl_cost_trustasia_evmultidomain - TrustAsia-增强型EV（多域名）
24. sv_ssl_cost_trustasia_ev - TrustAsia-增强型EV（单域名）
25. sv_ssl_cost_geotrust_evmultidomain - GeoTrust-增强型EV（多域名）
26. sv_ssl_cost_geotrust_ev - GeoTrust-增强型EV（单域名）
27. sv_ssl_cost_symantec_evmultidomain - SecureSite-增强型EV（多域名）
28. sv_ssl_cost_symantec_ev - SecureSite-增强型EV（单域名）
29. sv_ssl_cost_trustasia_dvwildcard - TrustAsia-域名型DV（泛域名）
30. sv_ssl_cost_trustasia_dvmultidomain - TrustAsia-域名型DV（多域名）
31. sv_ssl_cost_symantec_ovpromultidomain - SecureSite-企业型专业版OV Pro（多域名）
32. sv_ssl_cost_symantec_ovpro - SecureSite-企业型专业版OV Pro（单域名）
33. sv_ssl_cost_globalsign_ovwildcardmulti - GlobalSign-企业型OV（通配符多域名）
34. sv_ssl_cost_globalsign_ovwildcard - GlobalSign-企业型OV（泛域名）
35. sv_ssl_cost_globalsign_ovmultidomain - GlobalSign-企业型OV（多域名）
36. sv_ssl_cost_globalsign_ov - GlobalSign-企业型OV（单域名）
37. sv_ssl_cost_trustasia_ovwildcardmulti - TrustAsia-企业型OV（通配符多域名）
38. sv_ssl_cost_trustasia_ovwildcard - TrustAsia-企业型OV（泛域名）
39. sv_ssl_cost_trustasia_ovmultidomain - TrustAsia-企业型OV（多域名）
40. sv_ssl_cost_trustasia_ov - TrustAsia-企业型OV（单域名）
41. sv_ssl_cost_geotrust_ovwildcard - GeoTrust-企业型OV（泛域名）
42. sv_ssl_cost_geotrust_ov - GeoTrust-企业型OV（单域名）
43. sv_ssl_cost_symantec_ovwildcard - SecureSite-企业型OV（泛域名）
44. sv_ssl_cost_symantec_ovmultidomain - SecureSite-企业型OV（多域名）
45. sv_ssl_cost_symantec_ov - SecureSite-企业型OV（单域名）
46. sv_ssl_cost_dnspod_evmultidomain - DNSPod-国密增强型证书（多域名）
47. sv_ssl_cost_dnspod_ev - DNSPod-国密增强型证书
48. sv_ssl_cost_dnspod_ovwildcard - DNSPod-国密企业型证书（通配符）
49. sv_ssl_cost_dnspod_ovmultidomain - DNSPod-国密企业型证书（多域名）
50. sv_ssl_cost_dnspod_ov - DNSPod-国密企业型证书
51. sv_ssl_cost_dnspod_dvwildcard - DNSPod-国密域名型证书（通配符）
52. sv_ssl_cost_dnspod_dvmultidomain - DNSPod-国密域名型证书（多域名）
53. sv_ssl_cost_dnspod_dv - DNSPod-国密域名型证书
54. sv_ssl_cost_wotrus_evmultidomain - WoTrus-增强型证书（多域名）
55. sv_ssl_cost_wotrus_ev - WoTrus-增强型证书
56. sv_ssl_cost_wotrus_ovwildcard - WoTrus-企业型证书（通配符）
57. sv_ssl_cost_wotrus_ovmultidomain - WoTrus-企业型证书（多域名）
58. sv_ssl_cost_wotrus_ov - WoTrus-企业型证书
59. sv_ssl_cost_wotrus_dvwildcard - WoTrus-域名型证书（通配符）
60. sv_ssl_cost_wotrus_dvmultidomain - WoTrus-域名型证书（多域名）
61. sv_ssl_cost_wotrus_dv - WoTrus-域名型证书
     * @param PriceKey 询价参数，以下是对每个询价参数及其对应的证书文字说明：
1. sv_ssl_cost_cfca_ca_ev - CFCA-增强型(EV)SSL证书
2. sv_ssl_cost_cfca_ca_ovwildcard - CFCA-企业型(OV) SSL证书(通配符)
3. sv_ssl_cost_cfca_ca_ov - CFCA-企业型(OV)SSL证书
4. sv_ssl_cost_dnspod_ca_sm2_ovwildcard - DNSPod亚信国密-企业型(OV)通配符证书
5. sv_ssl_cost_dnspod_ca_sm2_ovmultidomain - DNSPod亚信国密-企业型(OV)多域名证书
6. sv_ssl_cost_dnspod_ca_sm2_ov - DNSPod亚信国密-企业型(OV)证书
7. sv_ssl_cost_dnspod_ca_sm2_dvwildcard - DNSPod亚信国密-域名型(DV)通配符证书
8. sv_ssl_cost_dnspod_ca_sm2_dvmultidomain - DNSPod亚信国密-域名型(DV)多域名证书
9. sv_ssl_cost_dnspod_ca_sm2_dv - DNSPod亚信国密-域名型(DV)证书
10. sv_ssl_cost_dnspod_ca_dv - DNSPod SSL 域名型SSL证书(C1)
11. sv_ssl_cost_dnspod_ca_dvmultidomain - DNSPod SSL域名型多域名SSL证书(C1)
12. sv_ssl_cost_dnspod_ca_dvwildcard - DNSPod-SSL域名型DV（泛域名）
13. sv_ssl_cost_dnspod_ca_ov - DNSPod 企业型SSL证书(C1)
14. sv_ssl_cost_dnspod_ca_ovmultidomain - DNSPod 企业型多域名SSL证书(C1)
15. sv_ssl_cost_dnspod_ca_ovwildcard - DNSPod 企业型通配符SSL证书(C1)
16. sv_ssl_cost_dnspod_ca_ev - DNSPod 增强型 SSL 证书(C1)
17. sv_ssl_cost_dnspod_ca_evmultidomain - DNSPod 增强型多域名SSL证书(C1)
18. sv_ssl_cost_trustasia_dvwildcardmulti - TrustAsia-域名型DV（通配符多域名）
19. sv_ssl_cost_securesiteevpromul_sh - SecureSite-增强型专业版EVPro（多域名）
20. sv_ssl_cost_symantec_evpro - SecureSite-增强型专业版EVPro（单域名）
21. sv_ssl_cost_globalsign_ev_mul_sh - GlobalSign-增强型EV（多域名）
22. sv_ssl_cost_globalsign_ev - GlobalSign-增强型EV（单域名）
23. sv_ssl_cost_trustasia_evmultidomain - TrustAsia-增强型EV（多域名）
24. sv_ssl_cost_trustasia_ev - TrustAsia-增强型EV（单域名）
25. sv_ssl_cost_geotrust_evmultidomain - GeoTrust-增强型EV（多域名）
26. sv_ssl_cost_geotrust_ev - GeoTrust-增强型EV（单域名）
27. sv_ssl_cost_symantec_evmultidomain - SecureSite-增强型EV（多域名）
28. sv_ssl_cost_symantec_ev - SecureSite-增强型EV（单域名）
29. sv_ssl_cost_trustasia_dvwildcard - TrustAsia-域名型DV（泛域名）
30. sv_ssl_cost_trustasia_dvmultidomain - TrustAsia-域名型DV（多域名）
31. sv_ssl_cost_symantec_ovpromultidomain - SecureSite-企业型专业版OV Pro（多域名）
32. sv_ssl_cost_symantec_ovpro - SecureSite-企业型专业版OV Pro（单域名）
33. sv_ssl_cost_globalsign_ovwildcardmulti - GlobalSign-企业型OV（通配符多域名）
34. sv_ssl_cost_globalsign_ovwildcard - GlobalSign-企业型OV（泛域名）
35. sv_ssl_cost_globalsign_ovmultidomain - GlobalSign-企业型OV（多域名）
36. sv_ssl_cost_globalsign_ov - GlobalSign-企业型OV（单域名）
37. sv_ssl_cost_trustasia_ovwildcardmulti - TrustAsia-企业型OV（通配符多域名）
38. sv_ssl_cost_trustasia_ovwildcard - TrustAsia-企业型OV（泛域名）
39. sv_ssl_cost_trustasia_ovmultidomain - TrustAsia-企业型OV（多域名）
40. sv_ssl_cost_trustasia_ov - TrustAsia-企业型OV（单域名）
41. sv_ssl_cost_geotrust_ovwildcard - GeoTrust-企业型OV（泛域名）
42. sv_ssl_cost_geotrust_ov - GeoTrust-企业型OV（单域名）
43. sv_ssl_cost_symantec_ovwildcard - SecureSite-企业型OV（泛域名）
44. sv_ssl_cost_symantec_ovmultidomain - SecureSite-企业型OV（多域名）
45. sv_ssl_cost_symantec_ov - SecureSite-企业型OV（单域名）
46. sv_ssl_cost_dnspod_evmultidomain - DNSPod-国密增强型证书（多域名）
47. sv_ssl_cost_dnspod_ev - DNSPod-国密增强型证书
48. sv_ssl_cost_dnspod_ovwildcard - DNSPod-国密企业型证书（通配符）
49. sv_ssl_cost_dnspod_ovmultidomain - DNSPod-国密企业型证书（多域名）
50. sv_ssl_cost_dnspod_ov - DNSPod-国密企业型证书
51. sv_ssl_cost_dnspod_dvwildcard - DNSPod-国密域名型证书（通配符）
52. sv_ssl_cost_dnspod_dvmultidomain - DNSPod-国密域名型证书（多域名）
53. sv_ssl_cost_dnspod_dv - DNSPod-国密域名型证书
54. sv_ssl_cost_wotrus_evmultidomain - WoTrus-增强型证书（多域名）
55. sv_ssl_cost_wotrus_ev - WoTrus-增强型证书
56. sv_ssl_cost_wotrus_ovwildcard - WoTrus-企业型证书（通配符）
57. sv_ssl_cost_wotrus_ovmultidomain - WoTrus-企业型证书（多域名）
58. sv_ssl_cost_wotrus_ov - WoTrus-企业型证书
59. sv_ssl_cost_wotrus_dvwildcard - WoTrus-域名型证书（通配符）
60. sv_ssl_cost_wotrus_dvmultidomain - WoTrus-域名型证书（多域名）
61. sv_ssl_cost_wotrus_dv - WoTrus-域名型证书
     */
    public void setPriceKey(String PriceKey) {
        this.PriceKey = PriceKey;
    }

    public CreateCertificateByPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCertificateByPackageRequest(CreateCertificateByPackageRequest source) {
        if (source.ProductPid != null) {
            this.ProductPid = new Long(source.ProductPid);
        }
        if (source.PackageIds != null) {
            this.PackageIds = new String[source.PackageIds.length];
            for (int i = 0; i < source.PackageIds.length; i++) {
                this.PackageIds[i] = new String(source.PackageIds[i]);
            }
        }
        if (source.DomainCount != null) {
            this.DomainCount = new String(source.DomainCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.RenewGenCsrMethod != null) {
            this.RenewGenCsrMethod = new String(source.RenewGenCsrMethod);
        }
        if (source.RenewCsr != null) {
            this.RenewCsr = new String(source.RenewCsr);
        }
        if (source.RenewAlgorithmType != null) {
            this.RenewAlgorithmType = new String(source.RenewAlgorithmType);
        }
        if (source.RenewAlgorithmParam != null) {
            this.RenewAlgorithmParam = new String(source.RenewAlgorithmParam);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.RenewKeyPass != null) {
            this.RenewKeyPass = new String(source.RenewKeyPass);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String(source.DomainNames);
        }
        if (source.CertificateCount != null) {
            this.CertificateCount = new Long(source.CertificateCount);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.PriceKey != null) {
            this.PriceKey = new String(source.PriceKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductPid", this.ProductPid);
        this.setParamArraySimple(map, prefix + "PackageIds.", this.PackageIds);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamSimple(map, prefix + "RenewGenCsrMethod", this.RenewGenCsrMethod);
        this.setParamSimple(map, prefix + "RenewCsr", this.RenewCsr);
        this.setParamSimple(map, prefix + "RenewAlgorithmType", this.RenewAlgorithmType);
        this.setParamSimple(map, prefix + "RenewAlgorithmParam", this.RenewAlgorithmParam);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RenewKeyPass", this.RenewKeyPass);
        this.setParamSimple(map, prefix + "DomainNames", this.DomainNames);
        this.setParamSimple(map, prefix + "CertificateCount", this.CertificateCount);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "PriceKey", this.PriceKey);

    }
}

