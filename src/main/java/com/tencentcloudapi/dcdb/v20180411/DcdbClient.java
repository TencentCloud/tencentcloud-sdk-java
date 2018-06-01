/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.dcdb.v20180411;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dcdb.v20180411.models.*;

public class DcdbClient extends AbstractClient{
    private static String endpoint = "dcdb.tencentcloudapi.com";
    private static String version = "2018-04-11";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public DcdbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public DcdbClient(Credential credential, String region, ClientProfile profile) {
        super(DcdbClient.endpoint, DcdbClient.version, credential, region, profile);
    }

    /**
     *本接口（CreateDCDBInstance）用于创建包年包月的云数据库实例，可通过传入实例规格、数据库版本号、购买时长等信息创建云数据库实例。
     * @param req CreateDCDBInstanceRequest
     * @return CreateDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDCDBInstanceResponse  CreateDCDBInstance(CreateDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDCDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDCDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDCDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBLogFiles)用于获取数据库的各种日志列表，包括冷备、binlog、errlog和slowlog。
     * @param req DescribeDBLogFilesRequest
     * @return DescribeDBLogFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBLogFilesResponse  DescribeDBLogFiles(DescribeDBLogFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBLogFilesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBLogFilesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBLogFiles"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云数据库实例列表，支持通过项目ID、实例ID、内网地址、实例名称等来筛选实例。
如果不指定任何筛选条件，则默认返回10条实例记录，单次请求最多支持返回100条实例记录。
     * @param req DescribeDCDBInstancesRequest
     * @return DescribeDCDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBInstancesResponse  DescribeDCDBInstances(DescribeDCDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBPrice）用于在购买实例前，查询实例的价格。
     * @param req DescribeDCDBPriceRequest
     * @return DescribeDCDBPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBPriceResponse  DescribeDCDBPrice(DescribeDCDBPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBRenewalPrice）用于在续费分布式数据库实例时，查询续费的价格。
     * @param req DescribeDCDBRenewalPriceRequest
     * @return DescribeDCDBRenewalPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBRenewalPriceResponse  DescribeDCDBRenewalPrice(DescribeDCDBRenewalPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBRenewalPriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBRenewalPriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBRenewalPrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDCDBSaleInfo)用于查询分布式数据库可售卖的地域和可用区信息。
     * @param req DescribeDCDBSaleInfoRequest
     * @return DescribeDCDBSaleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBSaleInfoResponse  DescribeDCDBSaleInfo(DescribeDCDBSaleInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBSaleInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBSaleInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBSaleInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDCDBUpgradePrice）用于查询升级分布式数据库实例价格。
     * @param req DescribeDCDBUpgradePriceRequest
     * @return DescribeDCDBUpgradePriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDCDBUpgradePriceResponse  DescribeDCDBUpgradePrice(DescribeDCDBUpgradePriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDCDBUpgradePriceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDCDBUpgradePriceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDCDBUpgradePrice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeOrders）用于查询分布式数据库订单信息。传入订单Id来查询订单关联的分布式数据库实例，和对应的任务流程ID。
     * @param req DescribeOrdersRequest
     * @return DescribeOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrdersResponse  DescribeOrders(DescribeOrdersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrdersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrdersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOrders"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询可创建的分布式数据库可售卖的分片规格配置。
     * @param req DescribeShardSpecRequest
     * @return DescribeShardSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShardSpecResponse  DescribeShardSpec(DescribeShardSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShardSpecResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShardSpecResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeShardSpec"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RenewDCDBInstance）用于续费分布式数据库实例。
     * @param req RenewDCDBInstanceRequest
     * @return RenewDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewDCDBInstanceResponse  RenewDCDBInstance(RenewDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDCDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDCDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewDCDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpgradeDCDBInstance）用于升级分布式数据库实例。本接口完成下单和支付两个动作，如果发生支付失败的错误，调用用户账户相关接口中的支付订单接口（PayDeals）重新支付即可。
     * @param req UpgradeDCDBInstanceRequest
     * @return UpgradeDCDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDCDBInstanceResponse  UpgradeDCDBInstance(UpgradeDCDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeDCDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeDCDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeDCDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
