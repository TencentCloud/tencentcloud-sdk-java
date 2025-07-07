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
package com.tencentcloudapi.cis.v20180408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cis.v20180408.models.*;

public class CisClient extends AbstractClient{
    private static String endpoint = "cis.tencentcloudapi.com";
    private static String service = "cis";
    private static String version = "2018-04-08";

    public CisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CisClient(Credential credential, String region, ClientProfile profile) {
        super(CisClient.endpoint, CisClient.version, credential, region, profile);
    }

    /**
     *此接口（CreateContainerInstance）用于创建容器实例
     * @param req CreateContainerInstanceRequest
     * @return CreateContainerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateContainerInstanceResponse CreateContainerInstance(CreateContainerInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateContainerInstance", CreateContainerInstanceResponse.class);
    }

    /**
     *此接口（DeleteContainerInstance）用于删除容器实例
     * @param req DeleteContainerInstanceRequest
     * @return DeleteContainerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteContainerInstanceResponse DeleteContainerInstance(DeleteContainerInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteContainerInstance", DeleteContainerInstanceResponse.class);
    }

    /**
     *此接口（DescribeContainerInstance）用于获取容器实例详情
     * @param req DescribeContainerInstanceRequest
     * @return DescribeContainerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerInstanceResponse DescribeContainerInstance(DescribeContainerInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerInstance", DescribeContainerInstanceResponse.class);
    }

    /**
     *此接口（DescribeContainerInstanceEvents）用于查询容器实例事件列表
     * @param req DescribeContainerInstanceEventsRequest
     * @return DescribeContainerInstanceEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerInstanceEventsResponse DescribeContainerInstanceEvents(DescribeContainerInstanceEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerInstanceEvents", DescribeContainerInstanceEventsResponse.class);
    }

    /**
     *此接口（DescribeContainerInstances）查询容器实例列表
     * @param req DescribeContainerInstancesRequest
     * @return DescribeContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerInstancesResponse DescribeContainerInstances(DescribeContainerInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerInstances", DescribeContainerInstancesResponse.class);
    }

    /**
     *此接口（DescribeContainerLog）用于获取容器日志信息
     * @param req DescribeContainerLogRequest
     * @return DescribeContainerLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContainerLogResponse DescribeContainerLog(DescribeContainerLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeContainerLog", DescribeContainerLogResponse.class);
    }

    /**
     *此接口（InquiryPriceCreateCis）用于查询容器实例价格
     * @param req InquiryPriceCreateCisRequest
     * @return InquiryPriceCreateCisResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateCisResponse InquiryPriceCreateCis(InquiryPriceCreateCisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateCis", InquiryPriceCreateCisResponse.class);
    }

}
