/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.btoe.v20210303;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.btoe.v20210303.models.*;

public class BtoeClient extends AbstractClient{
    private static String endpoint = "btoe.tencentcloudapi.com";
    private static String service = "btoe";
    private static String version = "2021-03-03";

    public BtoeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BtoeClient(Credential credential, String region, ClientProfile profile) {
        super(BtoeClient.endpoint, BtoeClient.version, credential, region, profile);
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的音频原文件或下载URL，BTOE对音频原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。音频类型支持格式：mp3、wav、wma、midi、flac；原文件上传大小不超过5 MB，下载URL文件大小不超过25 MB。
     * @param req CreateAudioDepositRequest
     * @return CreateAudioDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateAudioDepositResponse CreateAudioDeposit(CreateAudioDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAudioDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAudioDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAudioDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的业务数据明文，业务数据明文存证写入后不可修改，BTOE对业务数据明文存证生成含有电子签章的区块链存证电子凭证。
     * @param req CreateDataDepositRequest
     * @return CreateDataDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataDepositResponse CreateDataDeposit(CreateDataDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDataDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的文档原文件或下载URL，BTOE对文档原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。文档类型支持格式：doc、docx、xls、xlsx、ppt、pptx、 pdf、html、txt、md、csv；原文件上传大小不超过5 MB，下载URL文件大小不超过10 MB。
     * @param req CreateDocDepositRequest
     * @return CreateDocDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocDepositResponse CreateDocDeposit(CreateDocDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDocDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDocDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDocDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的原文数据Hash值，BTOE对业务数据Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。
     * @param req CreateHashDepositRequest
     * @return CreateHashDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateHashDepositResponse CreateHashDeposit(CreateHashDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHashDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHashDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHashDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的原文数据Hash值，BTOE对业务数据Hash值存证上链，本接口不生成区块链存证电子凭证。
     * @param req CreateHashDepositNoCertRequest
     * @return CreateHashDepositNoCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateHashDepositNoCertResponse CreateHashDepositNoCert(CreateHashDepositNoCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHashDepositNoCertResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHashDepositNoCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHashDepositNoCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的原文数据Hash值，BTOE对业务数据Hash值存证上链，并生成无电子签章的区块链存证电子凭证。
     * @param req CreateHashDepositNoSealRequest
     * @return CreateHashDepositNoSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateHashDepositNoSealResponse CreateHashDepositNoSeal(CreateHashDepositNoSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHashDepositNoSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHashDepositNoSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHashDepositNoSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的图片原文件或下载URL，BTOE对图片原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。图片类型支持格式：png、jpg、jpeg、bmp、gif、svg；原文件上传大小不超过5 MB，下载URL文件大小不超过10 MB。
     * @param req CreateImageDepositRequest
     * @return CreateImageDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageDepositResponse CreateImageDeposit(CreateImageDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImageDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE写入待存证的视频的原文件或下载URL，BTOE对视频原文件存储后，将其Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。视频文件支持格式：mp4、avi、mkv、mov、flv,wmv,rmvb,3gp；文件大小限制：直接上传原文件不大于5MB，下载URL文件大小不大于200 MB。
     * @param req CreateVideoDepositRequest
     * @return CreateVideoDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoDepositResponse CreateVideoDeposit(CreateVideoDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVideoDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVideoDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVideoDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过本接口向BTOE提交待存证网页的URL，BTOE对URL进行网页快照，并将快照图片存储，将网页快照Hash值存证上链，并生成含有电子签章的区块链存证电子凭证。URL格式必须以http、https开头。
     * @param req CreateWebpageDepositRequest
     * @return CreateWebpageDepositResponse
     * @throws TencentCloudSDKException
     */
    public CreateWebpageDepositResponse CreateWebpageDeposit(CreateWebpageDepositRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWebpageDepositResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWebpageDepositResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWebpageDeposit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过存证编码向BTOE查询存证电子凭证信息。
     * @param req GetDepositCertRequest
     * @return GetDepositCertResponse
     * @throws TencentCloudSDKException
     */
    public GetDepositCertResponse GetDepositCert(GetDepositCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDepositCertResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDepositCertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDepositCert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过存证编码向BTOE获取存证文件的下载URL。
-注：Hash类存证、业务数据明文存证不产生存证文件。
     * @param req GetDepositFileRequest
     * @return GetDepositFileResponse
     * @throws TencentCloudSDKException
     */
    public GetDepositFileResponse GetDepositFile(GetDepositFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDepositFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDepositFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDepositFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *功能迭代，已上线更高版本的接口2021-05-14

用户通过存证编码向BTOE查询存证基本信息。
     * @param req GetDepositInfoRequest
     * @return GetDepositInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetDepositInfoResponse GetDepositInfo(GetDepositInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDepositInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDepositInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDepositInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
