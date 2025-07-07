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
        req.setSkipSign(false);
        return this.internalRequest(req, "BindEipAcls", BindEipAclsResponse.class);
    }

    /**
     *BindHosted接口用于绑定黑石弹性公网IP到黑石托管机器上
     * @param req BindHostedRequest
     * @return BindHostedResponse
     * @throws TencentCloudSDKException
     */
    public BindHostedResponse BindHosted(BindHostedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindHosted", BindHostedResponse.class);
    }

    /**
     *绑定黑石EIP
     * @param req BindRsRequest
     * @return BindRsResponse
     * @throws TencentCloudSDKException
     */
    public BindRsResponse BindRs(BindRsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindRs", BindRsResponse.class);
    }

    /**
     *黑石EIP绑定VPC IP
     * @param req BindVpcIpRequest
     * @return BindVpcIpResponse
     * @throws TencentCloudSDKException
     */
    public BindVpcIpResponse BindVpcIp(BindVpcIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindVpcIp", BindVpcIpResponse.class);
    }

    /**
     *创建黑石弹性公网IP
     * @param req CreateEipRequest
     * @return CreateEipResponse
     * @throws TencentCloudSDKException
     */
    public CreateEipResponse CreateEip(CreateEipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEip", CreateEipResponse.class);
    }

    /**
     *创建黑石弹性公网 EIP ACL
     * @param req CreateEipAclRequest
     * @return CreateEipAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateEipAclResponse CreateEipAcl(CreateEipAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEipAcl", CreateEipAclResponse.class);
    }

    /**
     *释放黑石弹性公网IP
     * @param req DeleteEipRequest
     * @return DeleteEipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEipResponse DeleteEip(DeleteEipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEip", DeleteEipResponse.class);
    }

    /**
     *删除弹性公网IP ACL
     * @param req DeleteEipAclRequest
     * @return DeleteEipAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEipAclResponse DeleteEipAcl(DeleteEipAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEipAcl", DeleteEipAclResponse.class);
    }

    /**
     *查询弹性公网IP ACL
     * @param req DescribeEipAclsRequest
     * @return DescribeEipAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipAclsResponse DescribeEipAcls(DescribeEipAclsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEipAcls", DescribeEipAclsResponse.class);
    }

    /**
     *查询黑石EIP 限额
     * @param req DescribeEipQuotaRequest
     * @return DescribeEipQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipQuotaResponse DescribeEipQuota(DescribeEipQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEipQuota", DescribeEipQuotaResponse.class);
    }

    /**
     *黑石EIP查询任务状态
     * @param req DescribeEipTaskRequest
     * @return DescribeEipTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipTaskResponse DescribeEipTask(DescribeEipTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEipTask", DescribeEipTaskResponse.class);
    }

    /**
     *黑石EIP查询接口
     * @param req DescribeEipsRequest
     * @return DescribeEipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEipsResponse DescribeEips(DescribeEipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEips", DescribeEipsResponse.class);
    }

    /**
     *修改弹性公网IP ACL
     * @param req ModifyEipAclRequest
     * @return ModifyEipAclResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEipAclResponse ModifyEipAcl(ModifyEipAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEipAcl", ModifyEipAclResponse.class);
    }

    /**
     *黑石EIP修改计费方式
     * @param req ModifyEipChargeRequest
     * @return ModifyEipChargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEipChargeResponse ModifyEipCharge(ModifyEipChargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEipCharge", ModifyEipChargeResponse.class);
    }

    /**
     *更新黑石EIP名称
     * @param req ModifyEipNameRequest
     * @return ModifyEipNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEipNameResponse ModifyEipName(ModifyEipNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEipName", ModifyEipNameResponse.class);
    }

    /**
     *解绑弹性公网IP ACL
     * @param req UnbindEipAclsRequest
     * @return UnbindEipAclsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindEipAclsResponse UnbindEipAcls(UnbindEipAclsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindEipAcls", UnbindEipAclsResponse.class);
    }

    /**
     *UnbindHosted接口用于解绑托管机器上的EIP
     * @param req UnbindHostedRequest
     * @return UnbindHostedResponse
     * @throws TencentCloudSDKException
     */
    public UnbindHostedResponse UnbindHosted(UnbindHostedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindHosted", UnbindHostedResponse.class);
    }

    /**
     *解绑黑石EIP
     * @param req UnbindRsRequest
     * @return UnbindRsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindRsResponse UnbindRs(UnbindRsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindRs", UnbindRsResponse.class);
    }

    /**
     *批量解绑物理机弹性公网IP接口
     * @param req UnbindRsListRequest
     * @return UnbindRsListResponse
     * @throws TencentCloudSDKException
     */
    public UnbindRsListResponse UnbindRsList(UnbindRsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindRsList", UnbindRsListResponse.class);
    }

    /**
     *黑石EIP解绑VPCIP
     * @param req UnbindVpcIpRequest
     * @return UnbindVpcIpResponse
     * @throws TencentCloudSDKException
     */
    public UnbindVpcIpResponse UnbindVpcIp(UnbindVpcIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindVpcIp", UnbindVpcIpResponse.class);
    }

}
