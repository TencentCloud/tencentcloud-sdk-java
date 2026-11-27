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
package com.tencentcloudapi.antiddos.v20250903;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.antiddos.v20250903.models.*;

public class AntiddosClient extends AbstractClient{
    private static String endpoint = "antiddos.tencentcloudapi.com";
    private static String service = "antiddos";
    private static String version = "2025-09-03";

    public AntiddosClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AntiddosClient(Credential credential, String region, ClientProfile profile) {
        super(AntiddosClient.endpoint, AntiddosClient.version, credential, region, profile);
    }

    /**
     *<p>创建 DDoS 高防服务防护实例。</p>
<p>防护实例是高防服务下承载防护策略与防护资源的基本单元。创建后，您可以在实例中配置防护策略，并绑定需要防护的云资源。</p>
<p><strong>前提条件：</strong>当前腾讯云主账号已订阅 DDoS 高防套餐，具体操作请参见 <a href="https://cloud.tencent.com/document/product/297/137989">购买指引</a>。</p>
     * @param req CreateProtectionRequest
     * @return CreateProtectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtectionResponse CreateProtection(CreateProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProtection", CreateProtectionResponse.class);
    }

    /**
     *<p>删除防护实例。</p>
<p>删除后，该实例及其绑定的防护策略将不再生效。请确保实例中没有正在使用的防护资源，或已提前将防护资源换绑至其他实例。</p>
     * @param req DeleteProtectionRequest
     * @return DeleteProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProtectionResponse DeleteProtection(DeleteProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProtection", DeleteProtectionResponse.class);
    }

    /**
     *查询封堵解封记录和解封配额信息。
     * @param req DescribeDDoSBlockRecordsRequest
     * @return DescribeDDoSBlockRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSBlockRecordsResponse DescribeDDoSBlockRecords(DescribeDDoSBlockRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSBlockRecords", DescribeDDoSBlockRecordsResponse.class);
    }

    /**
     *<p>按防护实例 ID 查询该实例下的 L3/4 DDoS 防护策略详情。</p>
     * @param req DescribeDDoSProtectionPolicyRequest
     * @return DescribeDDoSProtectionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSProtectionPolicyResponse DescribeDDoSProtectionPolicy(DescribeDDoSProtectionPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSProtectionPolicy", DescribeDDoSProtectionPolicyResponse.class);
    }

    /**
     *<p>按防护实例 ID 查询该实例下绑定的防护资源，支持分页与按资源类型过滤。</p>
     * @param req DescribeProtectionResourcesRequest
     * @return DescribeProtectionResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectionResourcesResponse DescribeProtectionResources(DescribeProtectionResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectionResources", DescribeProtectionResourcesResponse.class);
    }

    /**
     *<p>按过滤条件查询当前账号下有权限访问的 DDoS 高防服务防护实例，支持分页返回。</p>
     * @param req DescribeProtectionsRequest
     * @return DescribeProtectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectionsResponse DescribeProtections(DescribeProtectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtections", DescribeProtectionsResponse.class);
    }

    /**
     *<p>按资源六段式查询云资源当前绑定的 DDoS 高防服务防护实例。</p>
     * @param req DescribeResourceProtectionsRequest
     * @return DescribeResourceProtectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceProtectionsResponse DescribeResourceProtections(DescribeResourceProtectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceProtections", DescribeResourceProtectionsResponse.class);
    }

    /**
     *<p>按防护实例 ID 修改该实例下的 L3/4 DDoS 防护策略。</p>
     * @param req ModifyDDoSProtectionPolicyRequest
     * @return ModifyDDoSProtectionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSProtectionPolicyResponse ModifyDDoSProtectionPolicy(ModifyDDoSProtectionPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSProtectionPolicy", ModifyDDoSProtectionPolicyResponse.class);
    }

    /**
     *修改防护实例。支持修改防护实例的名称。
     * @param req ModifyProtectionRequest
     * @return ModifyProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionResponse ModifyProtection(ModifyProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtection", ModifyProtectionResponse.class);
    }

    /**
     *<p>修改防护实例的防护资源。</p>
<p>向防护实例中添加、替换或移除防护对象（即绑定到该实例进行防护的云资源）。</p>
     * @param req ModifyProtectionResourceRequest
     * @return ModifyProtectionResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionResourceResponse ModifyProtectionResource(ModifyProtectionResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectionResource", ModifyProtectionResourceResponse.class);
    }

    /**
     *申请解封资源，可通过 DescribeDDoSBlockRecords 接口获取资源的封堵解封状态。
     * @param req UnblockResourcesRequest
     * @return UnblockResourcesResponse
     * @throws TencentCloudSDKException
     */
    public UnblockResourcesResponse UnblockResources(UnblockResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnblockResources", UnblockResourcesResponse.class);
    }

}
