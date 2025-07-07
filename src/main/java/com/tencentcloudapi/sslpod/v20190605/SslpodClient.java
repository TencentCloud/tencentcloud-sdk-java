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
package com.tencentcloudapi.sslpod.v20190605;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sslpod.v20190605.models.*;

public class SslpodClient extends AbstractClient{
    private static String endpoint = "sslpod.tencentcloudapi.com";
    private static String service = "sslpod";
    private static String version = "2019-06-05";

    public SslpodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SslpodClient(Credential credential, String region, ClientProfile profile) {
        super(SslpodClient.endpoint, SslpodClient.version, credential, region, profile);
    }

    /**
     *通过域名端口添加监控
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *通过域名ID删除监控的域名
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *获取仪表盘数据
     * @param req DescribeDashboardRequest
     * @return DescribeDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardResponse DescribeDashboard(DescribeDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDashboard", DescribeDashboardResponse.class);
    }

    /**
     *获取域名关联证书
     * @param req DescribeDomainCertsRequest
     * @return DescribeDomainCertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainCertsResponse DescribeDomainCerts(DescribeDomainCertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainCerts", DescribeDomainCertsResponse.class);
    }

    /**
     *获取账号下所有tag
     * @param req DescribeDomainTagsRequest
     * @return DescribeDomainTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainTagsResponse DescribeDomainTags(DescribeDomainTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainTags", DescribeDomainTagsResponse.class);
    }

    /**
     *通过searchType搜索已经添加的域名
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *获取通知额度信息
     * @param req DescribeNoticeInfoRequest
     * @return DescribeNoticeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoticeInfoResponse DescribeNoticeInfo(DescribeNoticeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNoticeInfo", DescribeNoticeInfoResponse.class);
    }

    /**
     *修改域名tag
     * @param req ModifyDomainTagsRequest
     * @return ModifyDomainTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainTagsResponse ModifyDomainTags(ModifyDomainTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainTags", ModifyDomainTagsResponse.class);
    }

    /**
     *强制重新检测域名
     * @param req RefreshDomainRequest
     * @return RefreshDomainResponse
     * @throws TencentCloudSDKException
     */
    public RefreshDomainResponse RefreshDomain(RefreshDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshDomain", RefreshDomainResponse.class);
    }

    /**
     *解析域名获得多个IP地址
     * @param req ResolveDomainRequest
     * @return ResolveDomainResponse
     * @throws TencentCloudSDKException
     */
    public ResolveDomainResponse ResolveDomain(ResolveDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResolveDomain", ResolveDomainResponse.class);
    }

}
