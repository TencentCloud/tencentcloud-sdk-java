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
package com.tencentcloudapi.mrs.v20200910;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mrs.v20200910.models.*;

public class MrsClient extends AbstractClient{
    private static String endpoint = "mrs.tencentcloudapi.com";
    private static String service = "mrs";
    private static String version = "2020-09-10";

    public MrsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MrsClient(Credential credential, String region, ClientProfile profile) {
        super(MrsClient.endpoint, MrsClient.version, credential, region, profile);
    }

    /**
     *药品说明书PDF文件结构化
     * @param req DrugInstructionObjectRequest
     * @return DrugInstructionObjectResponse
     * @throws TencentCloudSDKException
     */
    public DrugInstructionObjectResponse DrugInstructionObject(DrugInstructionObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DrugInstructionObject", DrugInstructionObjectResponse.class);
    }

    /**
     *医疗报告图片脱敏接口
     * @param req ImageMaskRequest
     * @return ImageMaskResponse
     * @throws TencentCloudSDKException
     */
    public ImageMaskResponse ImageMask(ImageMaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageMask", ImageMaskResponse.class);
    }

    /**
     *图片脱敏-异步接口
短时间大批量调用（例如>100上传/10分钟），如果遇到错误码“FalledOperation.AsyncQueueFullError”，请于数分钟后再次尝试提交。
     * @param req ImageMaskAsyncRequest
     * @return ImageMaskAsyncResponse
     * @throws TencentCloudSDKException
     */
    public ImageMaskAsyncResponse ImageMaskAsync(ImageMaskAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageMaskAsync", ImageMaskAsyncResponse.class);
    }

    /**
     *图片脱敏-异步获取结果接口
请于上传请求后24小时内获取结果。
     * @param req ImageMaskAsyncGetResultRequest
     * @return ImageMaskAsyncGetResultResponse
     * @throws TencentCloudSDKException
     */
    public ImageMaskAsyncGetResultResponse ImageMaskAsyncGetResult(ImageMaskAsyncGetResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageMaskAsyncGetResult", ImageMaskAsyncGetResultResponse.class);
    }

    /**
     *图片分类
     * @param req ImageToClassRequest
     * @return ImageToClassResponse
     * @throws TencentCloudSDKException
     */
    public ImageToClassResponse ImageToClass(ImageToClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageToClass", ImageToClassResponse.class);
    }

    /**
     *图片转结构化对象
     * @param req ImageToObjectRequest
     * @return ImageToObjectResponse
     * @throws TencentCloudSDKException
     */
    public ImageToObjectResponse ImageToObject(ImageToObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageToObject", ImageToObjectResponse.class);
    }

    /**
     *文本分类

适用场景：经过腾讯医疗专用 OCR 从图片识别之后的文本，并且需要加上每个字符的坐标信息，才可以调用此接口。通过其它 OCR 识别的文本可能不适配。医院的 XML 格式文本也不适配，XML 文件需要经过特殊转换才能直接调用此接口。单次调用传入的文本不宜超过 2000 字。如有需要调用此接口，建议先咨询产品团队。
     * @param req TextToClassRequest
     * @return TextToClassResponse
     * @throws TencentCloudSDKException
     */
    public TextToClassResponse TextToClass(TextToClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToClass", TextToClassResponse.class);
    }

    /**
     *文本转结构化对象。

适用场景：经过腾讯医疗专用 OCR 从图片识别之后的文本，可以调用此接口。通过其它 OCR 识别的文本可能不适配。医院的 XML 格式文本也不适配，XML 文件需要经过特殊转换才能直接调用此接口。单次调用传入的文本不宜超过 2000 字。
     * @param req TextToObjectRequest
     * @return TextToObjectResponse
     * @throws TencentCloudSDKException
     */
    public TextToObjectResponse TextToObject(TextToObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToObject", TextToObjectResponse.class);
    }

    /**
     *将PDF格式的体检报告文件结构化，解析关键信息。
注意：该接口是按照体检报告 PDF 页面数量统计次数，不是按照 PDF 文件数量统计次数。通过该接口传入的报告必须是体检报告，非体检报告可能无法正确解析。
     * @param req TurnPDFToObjectRequest
     * @return TurnPDFToObjectResponse
     * @throws TencentCloudSDKException
     */
    public TurnPDFToObjectResponse TurnPDFToObject(TurnPDFToObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TurnPDFToObject", TurnPDFToObjectResponse.class);
    }

    /**
     *体检报告PDF文件结构化-异步接口
     * @param req TurnPDFToObjectAsyncRequest
     * @return TurnPDFToObjectAsyncResponse
     * @throws TencentCloudSDKException
     */
    public TurnPDFToObjectAsyncResponse TurnPDFToObjectAsync(TurnPDFToObjectAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TurnPDFToObjectAsync", TurnPDFToObjectAsyncResponse.class);
    }

    /**
     *体检报告PDF文件结构化异步获取结果接口
     * @param req TurnPDFToObjectAsyncGetResultRequest
     * @return TurnPDFToObjectAsyncGetResultResponse
     * @throws TencentCloudSDKException
     */
    public TurnPDFToObjectAsyncGetResultResponse TurnPDFToObjectAsyncGetResult(TurnPDFToObjectAsyncGetResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TurnPDFToObjectAsyncGetResult", TurnPDFToObjectAsyncGetResultResponse.class);
    }

}
