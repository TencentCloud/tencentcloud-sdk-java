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
package com.tencentcloudapi.igtm.v20231024;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.igtm.v20231024.models.*;

public class IgtmClient extends AbstractClient{
    private static String endpoint = "igtm.tencentcloudapi.com";
    private static String service = "igtm";
    private static String version = "2023-10-24";

    public IgtmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IgtmClient(Credential credential, String region, ClientProfile profile) {
        super(IgtmClient.endpoint, IgtmClient.version, credential, region, profile);
    }

    /**
     *创建地址池
     * @param req CreateAddressPoolRequest
     * @return CreateAddressPoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressPoolResponse CreateAddressPool(CreateAddressPoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAddressPool", CreateAddressPoolResponse.class);
    }

    /**
     *创建实例接口，仅供免费实例使用
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *新增监控器
     * @param req CreateMonitorRequest
     * @return CreateMonitorResponse
     * @throws TencentCloudSDKException
     */
    public CreateMonitorResponse CreateMonitor(CreateMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMonitor", CreateMonitorResponse.class);
    }

    /**
     *购买套餐并支付，此接口会在余额扣费，谨慎调用
     * @param req CreatePackageAndPayRequest
     * @return CreatePackageAndPayResponse
     * @throws TencentCloudSDKException
     */
    public CreatePackageAndPayResponse CreatePackageAndPay(CreatePackageAndPayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePackageAndPay", CreatePackageAndPayResponse.class);
    }

    /**
     *新建策略接口
     * @param req CreateStrategyRequest
     * @return CreateStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateStrategyResponse CreateStrategy(CreateStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStrategy", CreateStrategyResponse.class);
    }

    /**
     *删除地址池
     * @param req DeleteAddressPoolRequest
     * @return DeleteAddressPoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressPoolResponse DeleteAddressPool(DeleteAddressPoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddressPool", DeleteAddressPoolResponse.class);
    }

    /**
     *删除监控器
     * @param req DeleteMonitorRequest
     * @return DeleteMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMonitorResponse DeleteMonitor(DeleteMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMonitor", DeleteMonitorResponse.class);
    }

    /**
     *删除策略接口
     * @param req DeleteStrategyRequest
     * @return DeleteStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStrategyResponse DeleteStrategy(DeleteStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStrategy", DeleteStrategyResponse.class);
    }

    /**
     *获取地址所属地域
     * @param req DescribeAddressLocationRequest
     * @return DescribeAddressLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressLocationResponse DescribeAddressLocation(DescribeAddressLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressLocation", DescribeAddressLocationResponse.class);
    }

    /**
     *地址池详情
     * @param req DescribeAddressPoolDetailRequest
     * @return DescribeAddressPoolDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressPoolDetailResponse DescribeAddressPoolDetail(DescribeAddressPoolDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressPoolDetail", DescribeAddressPoolDetailResponse.class);
    }

    /**
     *地址池列表
     * @param req DescribeAddressPoolListRequest
     * @return DescribeAddressPoolListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressPoolListResponse DescribeAddressPoolList(DescribeAddressPoolListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressPoolList", DescribeAddressPoolListResponse.class);
    }

    /**
     *探测任务包详情
     * @param req DescribeDetectPackageDetailRequest
     * @return DescribeDetectPackageDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetectPackageDetailResponse DescribeDetectPackageDetail(DescribeDetectPackageDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDetectPackageDetail", DescribeDetectPackageDetailResponse.class);
    }

    /**
     *探测任务套餐列表
     * @param req DescribeDetectTaskPackageListRequest
     * @return DescribeDetectTaskPackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetectTaskPackageListResponse DescribeDetectTaskPackageList(DescribeDetectTaskPackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDetectTaskPackageList", DescribeDetectTaskPackageListResponse.class);
    }

    /**
     *获取探测节点列表接口
     * @param req DescribeDetectorsRequest
     * @return DescribeDetectorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetectorsResponse DescribeDetectors(DescribeDetectorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDetectors", DescribeDetectorsResponse.class);
    }

    /**
     *查询分组线路列表接口
     * @param req DescribeDnsLineListRequest
     * @return DescribeDnsLineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsLineListResponse DescribeDnsLineList(DescribeDnsLineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDnsLineList", DescribeDnsLineListResponse.class);
    }

    /**
     *实例详情
     * @param req DescribeInstanceDetailRequest
     * @return DescribeInstanceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDetailResponse DescribeInstanceDetail(DescribeInstanceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDetail", DescribeInstanceDetailResponse.class);
    }

    /**
     *实例列表
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *实例套餐列表
     * @param req DescribeInstancePackageListRequest
     * @return DescribeInstancePackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancePackageListResponse DescribeInstancePackageList(DescribeInstancePackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancePackageList", DescribeInstancePackageListResponse.class);
    }

    /**
     *查询监控器详情接口
     * @param req DescribeMonitorDetailRequest
     * @return DescribeMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorDetailResponse DescribeMonitorDetail(DescribeMonitorDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorDetail", DescribeMonitorDetailResponse.class);
    }

    /**
     *获取所有监控器
     * @param req DescribeMonitorsRequest
     * @return DescribeMonitorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorsResponse DescribeMonitors(DescribeMonitorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitors", DescribeMonitorsResponse.class);
    }

    /**
     *配额查询
     * @param req DescribeQuotasRequest
     * @return DescribeQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotasResponse DescribeQuotas(DescribeQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuotas", DescribeQuotasResponse.class);
    }

    /**
     *策略详情
     * @param req DescribeStrategyDetailRequest
     * @return DescribeStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyDetailResponse DescribeStrategyDetail(DescribeStrategyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategyDetail", DescribeStrategyDetailResponse.class);
    }

    /**
     *策略列表接口
     * @param req DescribeStrategyListRequest
     * @return DescribeStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyListResponse DescribeStrategyList(DescribeStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategyList", DescribeStrategyListResponse.class);
    }

    /**
     *修改地址池
     * @param req ModifyAddressPoolRequest
     * @return ModifyAddressPoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressPoolResponse ModifyAddressPool(ModifyAddressPoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressPool", ModifyAddressPoolResponse.class);
    }

    /**
     *修改实例配置
     * @param req ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceConfigResponse ModifyInstanceConfig(ModifyInstanceConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceConfig", ModifyInstanceConfigResponse.class);
    }

    /**
     *修改监控器
     * @param req ModifyMonitorRequest
     * @return ModifyMonitorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMonitorResponse ModifyMonitor(ModifyMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMonitor", ModifyMonitorResponse.class);
    }

    /**
     *设置自动续费接口
     * @param req ModifyPackageAutoRenewRequest
     * @return ModifyPackageAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPackageAutoRenewResponse ModifyPackageAutoRenew(ModifyPackageAutoRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPackageAutoRenew", ModifyPackageAutoRenewResponse.class);
    }

    /**
     *修改策略接口
     * @param req ModifyStrategyRequest
     * @return ModifyStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStrategyResponse ModifyStrategy(ModifyStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStrategy", ModifyStrategyResponse.class);
    }

}
