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
package com.tencentcloudapi.tkgdq.v20190411;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tkgdq.v20190411.models.*;

public class TkgdqClient extends AbstractClient{
    private static String endpoint = "tkgdq.tencentcloudapi.com";
    private static String service = "tkgdq";
    private static String version = "2019-04-11";

    public TkgdqClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkgdqClient(Credential credential, String region, ClientProfile profile) {
        super(TkgdqClient.endpoint, TkgdqClient.version, credential, region, profile);
    }

    /**
     *输入实体名称，返回实体相关的信息如实体别名、实体英文名、实体详细信息、相关实体等
     * @param req DescribeEntityRequest
     * @return DescribeEntityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEntityResponse DescribeEntity(DescribeEntityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEntityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEntityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEntity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入两个实体，返回两个实体间的关系，例如马化腾与腾讯公司不仅是相关实体，二者还存在隶属关系（马化腾属于腾讯公司）。
     * @param req DescribeRelationRequest
     * @return DescribeRelationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelationResponse DescribeRelation(DescribeRelationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRelationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRelation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *三元组查询，主要分为两类，SP查询和PO查询。SP查询表示已知主语和谓语查询宾语，PO查询表示已知宾语和谓语查询主语。每一个SP或PO查询都是一个可独立执行的查询，TQL支持SP查询的嵌套查询，即主语可以是一个嵌套的子查询。其他复杂的三元组查询方法，请参考官网API文档示例。
     * @param req DescribeTripleRequest
     * @return DescribeTripleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTripleResponse DescribeTriple(DescribeTripleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTripleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTripleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTriple");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
