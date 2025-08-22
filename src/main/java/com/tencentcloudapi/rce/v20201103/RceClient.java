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
package com.tencentcloudapi.rce.v20201103;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rce.v20201103.models.*;

public class RceClient extends AbstractClient{
    private static String endpoint = "rce.tencentcloudapi.com";
    private static String service = "rce";
    private static String version = "2020-11-03";

    public RceClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RceClient(Credential credential, String region, ClientProfile profile) {
        super(RceClient.endpoint, RceClient.version, credential, region, profile);
    }

    /**
     *创建黑白名单，黑白名单数量上限为100
     * @param req CreateNameListRequest
     * @return CreateNameListResponse
     * @throws TencentCloudSDKException
     */
    public CreateNameListResponse CreateNameList(CreateNameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNameList", CreateNameListResponse.class);
    }

    /**
     *修改黑白名单状态 关闭 开启 删除
     * @param req DeleteNameListRequest
     * @return DeleteNameListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNameListResponse DeleteNameList(DeleteNameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNameList", DeleteNameListResponse.class);
    }

    /**
     *删除黑白名单数据
     * @param req DeleteNameListDataRequest
     * @return DeleteNameListDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNameListDataResponse DeleteNameListData(DeleteNameListDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNameListData", DeleteNameListDataResponse.class);
    }

    /**
     *列表展示黑白名单列表数据, 包含列表名称, 名单类型, 数据类型, 数据来源, 描述, 状态等
     * @param req DescribeNameListRequest
     * @return DescribeNameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNameListResponse DescribeNameList(DescribeNameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNameList", DescribeNameListResponse.class);
    }

    /**
     *黑白名单详情数据展示 名单id 客户appid uin 数据内容 开始时间和结束时间 状态 描述
     * @param req DescribeNameListDataListRequest
     * @return DescribeNameListDataListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNameListDataListResponse DescribeNameListDataList(DescribeNameListDataListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNameListDataList", DescribeNameListDataListResponse.class);
    }

    /**
     *查询黑白名单列表详情
     * @param req DescribeNameListDetailRequest
     * @return DescribeNameListDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNameListDetailResponse DescribeNameListDetail(DescribeNameListDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNameListDetail", DescribeNameListDetailResponse.class);
    }

    /**
     *RCE控制台预付费和后付费次数展示
     * @param req DescribeUserUsageCntRequest
     * @return DescribeUserUsageCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserUsageCntResponse DescribeUserUsageCnt(DescribeUserUsageCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserUsageCnt", DescribeUserUsageCntResponse.class);
    }

    /**
     *新增黑白名单数据，所有黑白名单数据总量上限为10000
     * @param req ImportNameListDataRequest
     * @return ImportNameListDataResponse
     * @throws TencentCloudSDKException
     */
    public ImportNameListDataResponse ImportNameListData(ImportNameListDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportNameListData", ImportNameListDataResponse.class);
    }

    /**
     *通用业务欺诈保护是基于人工智能技术和腾讯20年风控实战沉淀，依托腾讯海量业务构建的风控引擎，以轻量级的 SaaS 服务方式接入，帮助您快速解决注册、登录、营销活动等关键场景遇到的欺诈问题，实时防御黑灰产作恶。
     * @param req ManageMarketingRiskRequest
     * @return ManageMarketingRiskResponse
     * @throws TencentCloudSDKException
     */
    public ManageMarketingRiskResponse ManageMarketingRisk(ManageMarketingRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageMarketingRisk", ManageMarketingRiskResponse.class);
    }

    /**
     *修改列表数据 列表名称 列表类型 数据类型 状态 备注
     * @param req ModifyNameListRequest
     * @return ModifyNameListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNameListResponse ModifyNameList(ModifyNameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNameList", ModifyNameListResponse.class);
    }

    /**
     *修改黑白名单列表详情 详情内容 开始和结束时间 状态 备注等
     * @param req ModifyNameListDataRequest
     * @return ModifyNameListDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNameListDataResponse ModifyNameListData(ModifyNameListDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNameListData", ModifyNameListDataResponse.class);
    }

}
