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
package com.tencentcloudapi.ms.v20180408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ms.v20180408.models.*;

public class MsClient extends AbstractClient{
    private static String endpoint = "ms.tencentcloudapi.com";
    private static String service = "ms";
    private static String version = "2018-04-08";

    public MsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MsClient(Credential credential, String region, ClientProfile profile) {
        super(MsClient.endpoint, MsClient.version, credential, region, profile);
    }

    /**
     *将应用和资源进行绑定
     * @param req CreateBindInstanceRequest
     * @return CreateBindInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateBindInstanceResponse CreateBindInstance(CreateBindInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBindInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBindInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBindInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云COS文件存储临时密钥，密钥仅限于临时上传文件，有访问限制和时效性。
     * @param req CreateCosSecKeyInstanceRequest
     * @return CreateCosSecKeyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosSecKeyInstanceResponse CreateCosSecKeyInstance(CreateCosSecKeyInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosSecKeyInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCosSecKeyInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCosSecKeyInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户可以使用该接口自建资源，只支持白名单用户
     * @param req CreateResourceInstancesRequest
     * @return CreateResourceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceInstancesResponse CreateResourceInstances(CreateResourceInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourceInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResourceInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口批量提交应用进行应用扫描，扫描后需通过DescribeScanResults接口查询扫描结果
     * @param req CreateScanInstancesRequest
     * @return CreateScanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanInstancesResponse CreateScanInstances(CreateScanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScanInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScanInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScanInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口提交应用进行应用加固，加固后需通过DescribeShieldResult接口查询加固结果
     * @param req CreateShieldInstanceRequest
     * @return CreateShieldInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateShieldInstanceResponse CreateShieldInstance(CreateShieldInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShieldInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateShieldInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateShieldInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对资源进行策略新增
     * @param req CreateShieldPlanInstanceRequest
     * @return CreateShieldPlanInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateShieldPlanInstanceResponse CreateShieldPlanInstance(CreateShieldPlanInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShieldPlanInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateShieldPlanInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateShieldPlanInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个或者多个app扫描信息
     * @param req DeleteScanInstancesRequest
     * @return DeleteScanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScanInstancesResponse DeleteScanInstances(DeleteScanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScanInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScanInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScanInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个或者多个app加固信息
     * @param req DeleteShieldInstancesRequest
     * @return DeleteShieldInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShieldInstancesResponse DeleteShieldInstances(DeleteShieldInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShieldInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteShieldInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteShieldInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个用户的所有资源信息
     * @param req DescribeResourceInstancesRequest
     * @return DescribeResourceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceInstancesResponse DescribeResourceInstances(DescribeResourceInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查看app列表。
可以通过指定任务唯一标识ItemId来查询指定app的详细信息，或通过设定过滤器来查询满足过滤条件的app的详细信息。 指定偏移(Offset)和限制(Limit)来选择结果中的一部分，默认返回满足条件的前20个app信息。
     * @param req DescribeScanInstancesRequest
     * @return DescribeScanInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanInstancesResponse DescribeScanInstances(DescribeScanInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过CreateScanInstances接口提交应用进行风险批量扫描后，用此接口批量获取风险详细信息,包含漏洞信息，广告信息，插件信息和病毒信息
     * @param req DescribeScanResultsRequest
     * @return DescribeScanResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanResultsResponse DescribeScanResults(DescribeScanResultsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanResultsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanResultsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanResults");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查看app列表。
可以通过指定任务唯一标识ItemId来查询指定app的详细信息，或通过设定过滤器来查询满足过滤条件的app的详细信息。 指定偏移(Offset)和限制(Limit)来选择结果中的一部分，默认返回满足条件的前20个app信息。

     * @param req DescribeShieldInstancesRequest
     * @return DescribeShieldInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldInstancesResponse DescribeShieldInstances(DescribeShieldInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShieldInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询加固策略
     * @param req DescribeShieldPlanInstanceRequest
     * @return DescribeShieldPlanInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldPlanInstanceResponse DescribeShieldPlanInstance(DescribeShieldPlanInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldPlanInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldPlanInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShieldPlanInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过唯一标识获取加固的结果
     * @param req DescribeShieldResultRequest
     * @return DescribeShieldResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldResultResponse DescribeShieldResult(DescribeShieldResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShieldResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户基础信息
     * @param req DescribeUserBaseInfoInstanceRequest
     * @return DescribeUserBaseInfoInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserBaseInfoInstanceResponse DescribeUserBaseInfoInstance(DescribeUserBaseInfoInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserBaseInfoInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserBaseInfoInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserBaseInfoInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
