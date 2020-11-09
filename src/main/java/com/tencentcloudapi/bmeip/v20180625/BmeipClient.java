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
package com.tencentcloudapi.bmeip.v20180625;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bmeip.v20180625.models.*;

public class BmeipClient extends AbstractClient{
    private static String endpoint = "bmeip.tencentcloudapi.com";
    private static String service = "bmeip";
    private static String version = "2018-06-25";

    public BmeipClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmeipClient(Credential credential, String region, ClientProfile profile) {
        super(BmeipClient.endpoint, BmeipClient.version, credential, region, profile);
    }

    /**
     *此接口用于为某个 EIP 关联 ACL。
     * @param req BindEipAclsRequest
     * @return BindEipAclsResponse
     * @throws TencentCloudSDKException
     */
    public BindEipAclsResponse BindEipAcls(BindEipAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEipAclsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindEipAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindEipAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *BindHosted接口用于绑定黑石弹性公网IP到黑石托管机器上
     * @param req BindHostedRequest
     * @return BindHostedResponse
     * @throws TencentCloudSDKException
     */
    public BindHostedResponse BindHosted(BindHostedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindHostedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindHostedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindHosted");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定黑石EIP
     * @param req BindRsRequest
     * @return BindRsResponse
     * @throws TencentCloudSDKException
     */
    public BindRsResponse BindRs(BindRsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindRsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindRsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindRs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *黑石EIP绑定VPCIP
     * @param req BindVpcIpRequest
     * @return BindVpcIpResponse
     * @throws TencentCloudSDKException
     */
    public BindVpcIpResponse BindVpcIp(BindVpcIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindVpcIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindVpcIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindVpcIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石弹性公网IP
     * @param req CreateEipRequest
     * @return CreateEipResponse
     * @throws TencentCloudSDKException
     */
    public CreateEipResponse CreateEip(CreateEipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石弹性公网 EIPACL
     * @param req CreateEipAclRequest
     * @return CreateEipAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateEipAclResponse CreateEipAcl(CreateEipAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEipAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEipAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEipAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *释放黑石弹性公网IP
     * @param req DeleteEipRequest
     * @return DeleteEipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEipResponse DeleteEip(DeleteEipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除弹性公网IP ACL
     * @param req DeleteEipAclRequest
     * @return DeleteEipAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEipAclResponse DeleteEipAcl(DeleteEipAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEipAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEipAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEipAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询弹性公网IP ACL
     * @param req DescribeEipAclsRequest
     * @return DescribeEipAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipAclsResponse DescribeEipAcls(DescribeEipAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEipAclsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEipAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEipAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询黑石EIP 限额
     * @param req DescribeEipQuotaRequest
     * @return DescribeEipQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipQuotaResponse DescribeEipQuota(DescribeEipQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEipQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEipQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEipQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *黑石EIP查询任务状态
     * @param req DescribeEipTaskRequest
     * @return DescribeEipTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipTaskResponse DescribeEipTask(DescribeEipTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEipTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEipTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEipTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *黑石EIP查询接口
     * @param req DescribeEipsRequest
     * @return DescribeEipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipsResponse DescribeEips(DescribeEipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEipsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEipsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEips");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改弹性公网IP ACL
     * @param req ModifyEipAclRequest
     * @return ModifyEipAclResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEipAclResponse ModifyEipAcl(ModifyEipAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEipAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEipAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEipAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *黑石EIP修改计费方式
     * @param req ModifyEipChargeRequest
     * @return ModifyEipChargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEipChargeResponse ModifyEipCharge(ModifyEipChargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEipChargeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEipChargeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEipCharge");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新黑石EIP名称
     * @param req ModifyEipNameRequest
     * @return ModifyEipNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEipNameResponse ModifyEipName(ModifyEipNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEipNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEipNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEipName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑弹性公网IP ACL
     * @param req UnbindEipAclsRequest
     * @return UnbindEipAclsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindEipAclsResponse UnbindEipAcls(UnbindEipAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindEipAclsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindEipAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindEipAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *UnbindHosted接口用于解绑托管机器上的EIP
     * @param req UnbindHostedRequest
     * @return UnbindHostedResponse
     * @throws TencentCloudSDKException
     */
    public UnbindHostedResponse UnbindHosted(UnbindHostedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindHostedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindHostedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindHosted");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑黑石EIP
     * @param req UnbindRsRequest
     * @return UnbindRsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindRsResponse UnbindRs(UnbindRsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindRsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindRsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindRs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量解绑物理机弹性公网IP接口
     * @param req UnbindRsListRequest
     * @return UnbindRsListResponse
     * @throws TencentCloudSDKException
     */
    public UnbindRsListResponse UnbindRsList(UnbindRsListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindRsListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindRsListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindRsList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *黑石EIP解绑VPCIP
     * @param req UnbindVpcIpRequest
     * @return UnbindVpcIpResponse
     * @throws TencentCloudSDKException
     */
    public UnbindVpcIpResponse UnbindVpcIp(UnbindVpcIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindVpcIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindVpcIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindVpcIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
