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
package com.tencentcloudapi.btoe.v20210514;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.btoe.v20210514.models.*;

public class BtoeClient extends AbstractClient{
    private static String endpoint = "btoe.tencentcloudapi.com";
    private static String service = "btoe";
    private static String version = "2021-05-14";

    public BtoeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BtoeClient(Credential credential, String region, ClientProfile profile) {
        super(BtoeClient.endpoint, BtoeClient.version, credential, region, profile);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的音频原文件或下载URL，BTOE对音频原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。音频类型支持格式：mp3、wav、wma、midi、flac；原文件上传大小不超过5 MB，下载URL文件大小不超过25 MB。
     * @param req CreateAudioDepositRequest
     * @return CreateAudioDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateAudioDepositResponse CreateAudioDeposit(CreateAudioDepositRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAudioDeposit", CreateAudioDepositResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的业务数据明文，业务数据明文存证写入后不可修改，BTOE对业务数据明文存证生成含有电子签章的区块链存证电子凭证。
     * @param req CreateDataDepositRequest
     * @return CreateDataDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataDepositResponse CreateDataDeposit(CreateDataDepositRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataDeposit", CreateDataDepositResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的文档原文件或下载URL，BTOE对文档原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。文档类型支持格式：doc、docx、xls、xlsx、ppt、pptx、 pdf、html、txt、md、csv；原文件上传大小不超过5 MB，下载URL文件大小不超过10 MB。
     * @param req CreateDocDepositRequest
     * @return CreateDocDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocDepositResponse CreateDocDeposit(CreateDocDepositRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDocDeposit", CreateDocDepositResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的原文数据Hash值，BTOE对业务数据Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。
     * @param req CreateHashDepositRequest
     * @return CreateHashDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateHashDepositResponse CreateHashDeposit(CreateHashDepositRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHashDeposit", CreateHashDepositResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品云API接口下线。

用户通过本接口向BTOE写入待存证的原文数据Hash值，BTOE对业务数据Hash值存证上链，本接口不生成区块链存证电子凭证。
     * @param req CreateHashDepositNoCertRequest
     * @return CreateHashDepositNoCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateHashDepositNoCertResponse CreateHashDepositNoCert(CreateHashDepositNoCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHashDepositNoCert", CreateHashDepositNoCertResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的原文数据Hash值，BTOE对业务数据Hash值存证上链，并生成无电子签章的区块链存证电子凭证。
     * @param req CreateHashDepositNoSealRequest
     * @return CreateHashDepositNoSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateHashDepositNoSealResponse CreateHashDepositNoSeal(CreateHashDepositNoSealRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHashDepositNoSeal", CreateHashDepositNoSealResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的图片原文件或下载URL，BTOE对图片原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。图片类型支持格式：png、jpg、jpeg、bmp、gif、svg；原文件上传大小不超过5 MB，下载URL文件大小不超过10 MB。
     * @param req CreateImageDepositRequest
     * @return CreateImageDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageDepositResponse CreateImageDeposit(CreateImageDepositRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageDeposit", CreateImageDepositResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过本接口向BTOE写入待存证的视频的原文件或下载URL，BTOE对视频原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。视频文件支持格式：mp4、avi、mkv、mov、flv,wmv,rmvb,3gp；文件大小限制：直接上传原文件不大于5MB。
     * @param req CreateVideoDepositRequest
     * @return CreateVideoDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoDepositResponse CreateVideoDeposit(CreateVideoDepositRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoDeposit", CreateVideoDepositResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品api接口下线。

用户通过存证编码向BTOE查询存证电子凭证信息。
     * @param req GetDepositCertRequest
     * @return GetDepositCertResponse
     * @throws TencentCloudSDKException
     */
    public GetDepositCertResponse GetDepositCert(GetDepositCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDepositCert", GetDepositCertResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过存证编码向BTOE获取存证文件的下载URL。
-注：Hash类存证、业务数据明文存证不产生存证文件。
     * @param req GetDepositFileRequest
     * @return GetDepositFileResponse
     * @throws TencentCloudSDKException
     */
    public GetDepositFileResponse GetDepositFile(GetDepositFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDepositFile", GetDepositFileResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户通过存证编码向BTOE查询存证基本信息。
     * @param req GetDepositInfoRequest
     * @return GetDepositInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetDepositInfoResponse GetDepositInfo(GetDepositInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDepositInfo", GetDepositInfoResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户向BTOE核验存证结果中的区块链交易hash的真实性
     * @param req VerifyEvidenceBlockChainTxHashRequest
     * @return VerifyEvidenceBlockChainTxHashResponse
     * @throws TencentCloudSDKException
     */
    public VerifyEvidenceBlockChainTxHashResponse VerifyEvidenceBlockChainTxHash(VerifyEvidenceBlockChainTxHashRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyEvidenceBlockChainTxHash", VerifyEvidenceBlockChainTxHashResponse.class);
    }

    /**
     *腾讯云可信取证产品BTOE已经正常退市，发起退市时间为：2023-12-31，全面停止支持时间是：2024-12-31。安全团队已经做好服务侧告知，根据子类退市规定，需要将该产品控制台下线。

用户存证内容hash向BTOE核验存证记录的真实性。
     * @param req VerifyEvidenceHashRequest
     * @return VerifyEvidenceHashResponse
     * @throws TencentCloudSDKException
     */
    public VerifyEvidenceHashResponse VerifyEvidenceHash(VerifyEvidenceHashRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyEvidenceHash", VerifyEvidenceHashResponse.class);
    }

}
