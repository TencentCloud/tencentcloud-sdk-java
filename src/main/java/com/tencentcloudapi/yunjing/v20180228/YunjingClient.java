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
package com.tencentcloudapi.yunjing.v20180228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.yunjing.v20180228.models.*;

public class YunjingClient extends AbstractClient{
    private static String endpoint = "yunjing.tencentcloudapi.com";
    private static String version = "2018-02-28";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public YunjingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public YunjingClient(Credential credential, String region, ClientProfile profile) {
        super(YunjingClient.endpoint, YunjingClient.version, credential, region, profile);
    }

    /**
     *本接口 (CloseProVersion) 用于关闭专业版。
     * @param req CloseProVersionRequest
     * @return CloseProVersionResponse
     * @throws TencentCloudSDKException
     */
    public CloseProVersionResponse  CloseProVersion(CloseProVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseProVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CloseProVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CloseProVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateUsualLoginPlaces）用于添加常用登录地。
     * @param req CreateUsualLoginPlacesRequest
     * @return CreateUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsualLoginPlacesResponse  CreateUsualLoginPlaces(CreateUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUsualLoginPlacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUsualLoginPlacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUsualLoginPlaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteBruteAttacks) 用于删除暴力破解记录。
     * @param req DeleteBruteAttacksRequest
     * @return DeleteBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBruteAttacksResponse  DeleteBruteAttacks(DeleteBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBruteAttacksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBruteAttacksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteBruteAttacks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteMachine）用于卸载云镜客户端。
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse  DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMachineResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMachine"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteMalwares) 用于删除木马记录。
     * @param req DeleteMalwaresRequest
     * @return DeleteMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwaresResponse  DeleteMalwares(DeleteMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMalwaresResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMalwaresResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMalwares"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteNonlocalLoginPlaces) 用于删除异地登录记录。
     * @param req DeleteNonlocalLoginPlacesRequest
     * @return DeleteNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNonlocalLoginPlacesResponse  DeleteNonlocalLoginPlaces(DeleteNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNonlocalLoginPlacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNonlocalLoginPlacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNonlocalLoginPlaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteUsualLoginPlaces）用于删除常用登录地。
     * @param req DeleteUsualLoginPlacesRequest
     * @return DeleteUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsualLoginPlacesResponse  DeleteUsualLoginPlaces(DeleteUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsualLoginPlacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsualLoginPlacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUsualLoginPlaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAgentVuls) 用于获取主机的漏洞列表。
     * @param req DescribeAgentVulsRequest
     * @return DescribeAgentVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentVulsResponse  DescribeAgentVuls(DescribeAgentVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentVulsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentVulsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentVuls"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAlarmAttribute) 用于获取告警设置。
     * @param req DescribeAlarmAttributeRequest
     * @return DescribeAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmAttributeResponse  DescribeAlarmAttribute(DescribeAlarmAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAlarmAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口{DescribeBruteAttacks}用于获取暴力破解事件列表。
     * @param req DescribeBruteAttacksRequest
     * @return DescribeBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttacksResponse  DescribeBruteAttacks(DescribeBruteAttacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBruteAttacksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBruteAttacksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBruteAttacks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeImpactedHosts) 用于获取漏洞受影响机器列表。
     * @param req DescribeImpactedHostsRequest
     * @return DescribeImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImpactedHostsResponse  DescribeImpactedHosts(DescribeImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImpactedHostsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImpactedHostsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImpactedHosts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMachineInfo）用于获取机器详细信息。
     * @param req DescribeMachineInfoRequest
     * @return DescribeMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineInfoResponse  DescribeMachineInfo(DescribeMachineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMachineInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeMachines) 用于获取区域主机列表。
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse  DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachinesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMachines"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeMalwares）用于获取木马事件列表。
     * @param req DescribeMalwaresRequest
     * @return DescribeMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwaresResponse  DescribeMalwares(DescribeMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMalwaresResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMalwaresResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMalwares"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeNonlocalLoginPlaces)用于获取异地登录事件。
     * @param req DescribeNonlocalLoginPlacesRequest
     * @return DescribeNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNonlocalLoginPlacesResponse  DescribeNonlocalLoginPlaces(DescribeNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNonlocalLoginPlacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNonlocalLoginPlacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNonlocalLoginPlaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于（DescribeOverviewStatistics）获取概览统计数据。
     * @param req DescribeOverviewStatisticsRequest
     * @return DescribeOverviewStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewStatisticsResponse  DescribeOverviewStatistics(DescribeOverviewStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOverviewStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOverviewStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeProVersionInfo) 用于获取专业版信息。
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse  DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProVersionInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProVersionInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProVersionInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeUsualLoginPlaces）用于查询常用登录地。
     * @param req DescribeUsualLoginPlacesRequest
     * @return DescribeUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsualLoginPlacesResponse  DescribeUsualLoginPlaces(DescribeUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsualLoginPlacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsualLoginPlacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUsualLoginPlaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVulInfo) 用于获取漏洞详情。
     * @param req DescribeVulInfoRequest
     * @return DescribeVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoResponse  DescribeVulInfo(DescribeVulInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVulInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVulScanResult) 用于获取漏洞检测结果。

     * @param req DescribeVulScanResultRequest
     * @return DescribeVulScanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanResultResponse  DescribeVulScanResult(DescribeVulScanResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulScanResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulScanResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVulScanResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVuls) 用于获取漏洞列表数据。
     * @param req DescribeVulsRequest
     * @return DescribeVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsResponse  DescribeVuls(DescribeVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVuls"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (IngoreImpactedHosts) 用于忽略漏洞。
     * @param req IgnoreImpactedHostsRequest
     * @return IgnoreImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreImpactedHostsResponse  IgnoreImpactedHosts(IgnoreImpactedHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IgnoreImpactedHostsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IgnoreImpactedHostsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IgnoreImpactedHosts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口{MisAlarmNonlocalLoginPlaces}将设置当前地点为常用登录地。
     * @param req MisAlarmNonlocalLoginPlacesRequest
     * @return MisAlarmNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public MisAlarmNonlocalLoginPlacesResponse  MisAlarmNonlocalLoginPlaces(MisAlarmNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MisAlarmNonlocalLoginPlacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MisAlarmNonlocalLoginPlacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MisAlarmNonlocalLoginPlaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAlarmAttribute）用于修改告警设置。
     * @param req ModifyAlarmAttributeRequest
     * @return ModifyAlarmAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmAttributeResponse  ModifyAlarmAttribute(ModifyAlarmAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAlarmAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyAutoOpenProVersionConfig) 用于设置新增主机自动开通专业版配置。
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse  ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoOpenProVersionConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoOpenProVersionConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoOpenProVersionConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RecoverMalwares）用于批量恢复已经被隔离的木马文件。
     * @param req RecoverMalwaresRequest
     * @return RecoverMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMalwaresResponse  RecoverMalwares(RecoverMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverMalwaresResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverMalwaresResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecoverMalwares"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (RescanImpactedHosts) 用于漏洞重新检测。
     * @param req RescanImpactedHostRequest
     * @return RescanImpactedHostResponse
     * @throws TencentCloudSDKException
     */
    public RescanImpactedHostResponse  RescanImpactedHost(RescanImpactedHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RescanImpactedHostResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RescanImpactedHostResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RescanImpactedHost"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SeparateMalwares）用于隔离木马。
     * @param req SeparateMalwaresRequest
     * @return SeparateMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public SeparateMalwaresResponse  SeparateMalwares(SeparateMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SeparateMalwaresResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SeparateMalwaresResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SeparateMalwares"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(TrustMalwares)将被识别木马文件设为信任。
     * @param req TrustMalwaresRequest
     * @return TrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public TrustMalwaresResponse  TrustMalwares(TrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrustMalwaresResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TrustMalwaresResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TrustMalwares"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UntrustMalwares）用于取消信任木马文件。
     * @param req UntrustMalwaresRequest
     * @return UntrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMalwaresResponse  UntrustMalwares(UntrustMalwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UntrustMalwaresResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UntrustMalwaresResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UntrustMalwares"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
