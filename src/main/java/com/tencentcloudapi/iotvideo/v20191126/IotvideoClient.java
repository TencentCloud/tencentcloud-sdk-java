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
package com.tencentcloudapi.iotvideo.v20191126;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotvideo.v20191126.models.*;

public class IotvideoClient extends AbstractClient{
    private static String endpoint = "iotvideo.tencentcloudapi.com";
    private static String service = "iotvideo";
    private static String version = "2019-11-26";

    public IotvideoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotvideoClient(Credential credential, String region, ClientProfile profile) {
        super(IotvideoClient.endpoint, IotvideoClient.version, credential, region, profile);
    }

    /**
     *清除设备激活码
     * @param req ClearDeviceActiveCodeRequest
     * @return ClearDeviceActiveCodeResponse
     * @throws TencentCloudSDKException
     */
    public ClearDeviceActiveCodeResponse ClearDeviceActiveCode(ClearDeviceActiveCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearDeviceActiveCode", ClearDeviceActiveCodeResponse.class);
    }

    /**
     *创建匿名访问Token
     * @param req CreateAnonymousAccessTokenRequest
     * @return CreateAnonymousAccessTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnonymousAccessTokenResponse CreateAnonymousAccessToken(CreateAnonymousAccessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAnonymousAccessToken", CreateAnonymousAccessTokenResponse.class);
    }

    /**
     *本接口（CreateAppUsr）用于接收由厂商云发送过来的注册请求,建立厂商云终端用户与IoT Video终端用户的映射关系。
     * @param req CreateAppUsrRequest
     * @return CreateAppUsrResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppUsrResponse CreateAppUsr(CreateAppUsrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAppUsr", CreateAppUsrResponse.class);
    }

    /**
     *本接口（CreateBinding）用于终端用户和设备进行绑定，具体的应用场景如下：
    终端用户与设备具有“强关联”关系。用户与设备绑定之后，用户终端即具备了该设备的访问权限,访问或操作设备时，无需获取设备访问Token。
     * @param req CreateBindingRequest
     * @return CreateBindingResponse
     * @throws TencentCloudSDKException
     */
    public CreateBindingResponse CreateBinding(CreateBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBinding", CreateBindingResponse.class);
    }

    /**
     *本接口（CreateDevToken）用于以下场景：
终端用户与设备没有强绑定关联关系;
允许终端用户短时或一次性临时访问设备;
当终端用户与设备有强绑定关系时，可以不用调用此接口
     * @param req CreateDevTokenRequest
     * @return CreateDevTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateDevTokenResponse CreateDevToken(CreateDevTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevToken", CreateDevTokenResponse.class);
    }

    /**
     *本接口（CreateDevices）用于批量创建新的物联网视频通信设备。
注意：腾讯云不会对设备私钥进行保存，请自行保管好您的设备私钥。
     * @param req CreateDevicesRequest
     * @return CreateDevicesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDevicesResponse CreateDevices(CreateDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevices", CreateDevicesResponse.class);
    }

    /**
     *本接口（CreateGencode）用于生成设备物模型源代码
     * @param req CreateGencodeRequest
     * @return CreateGencodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateGencodeResponse CreateGencode(CreateGencodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGencode", CreateGencodeResponse.class);
    }

    /**
     *本接口（CreateIotDataType）用于创建自定义物模型数据类型。
     * @param req CreateIotDataTypeRequest
     * @return CreateIotDataTypeResponse
     * @throws TencentCloudSDKException
     */
    public CreateIotDataTypeResponse CreateIotDataType(CreateIotDataTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIotDataType", CreateIotDataTypeResponse.class);
    }

    /**
     *本接口（CreateIotModel）用于定义的物模型提交。
该接口实现了物模型草稿箱的功能，保存用户最后一次编辑的物模型数据。
     * @param req CreateIotModelRequest
     * @return CreateIotModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateIotModelResponse CreateIotModel(CreateIotModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIotModel", CreateIotModelResponse.class);
    }

    /**
     *本接口（CreateProduct）用于创建一个新的物联网智能视频产品。
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProduct", CreateProductResponse.class);
    }

    /**
     *该接口已经停止维护，请勿使用
     * @param req CreateStorageRequest
     * @return CreateStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageResponse CreateStorage(CreateStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorage", CreateStorageResponse.class);
    }

    /**
     *购买云存服务
     * @param req CreateStorageServiceRequest
     * @return CreateStorageServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateStorageServiceResponse CreateStorageService(CreateStorageServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStorageService", CreateStorageServiceResponse.class);
    }

    /**
     *本接口（CreateTraceIds）用于将设备加到日志跟踪白名单。
     * @param req CreateTraceIdsRequest
     * @return CreateTraceIdsResponse
     * @throws TencentCloudSDKException
     */
    public CreateTraceIdsResponse CreateTraceIds(CreateTraceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTraceIds", CreateTraceIdsResponse.class);
    }

    /**
     *本接口（CreateUploadPath）用于获取固件上传路径。
     * @param req CreateUploadPathRequest
     * @return CreateUploadPathResponse
     * @throws TencentCloudSDKException
     */
    public CreateUploadPathResponse CreateUploadPath(CreateUploadPathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUploadPath", CreateUploadPathResponse.class);
    }

    /**
     *设备申请cos上传证书
     * @param req CreateUploadTestRequest
     * @return CreateUploadTestResponse
     * @throws TencentCloudSDKException
     */
    public CreateUploadTestResponse CreateUploadTest(CreateUploadTestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUploadTest", CreateUploadTestResponse.class);
    }

    /**
     *本接口（CreateUsrToken）用于终端用户获取IoT Video平台的accessToken，初始化SDK,连接到IoT Video接入服务器。
     * @param req CreateUsrTokenRequest
     * @return CreateUsrTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateUsrTokenResponse CreateUsrToken(CreateUsrTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUsrToken", CreateUsrTokenResponse.class);
    }

    /**
     *本接口（DeleteAppUsr）用于删除终端用户。
     * @param req DeleteAppUsrRequest
     * @return DeleteAppUsrResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppUsrResponse DeleteAppUsr(DeleteAppUsrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAppUsr", DeleteAppUsrResponse.class);
    }

    /**
     *本接口（DeleteBinding）用于终端用户和设备进行解绑定。
     * @param req DeleteBindingRequest
     * @return DeleteBindingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBindingResponse DeleteBinding(DeleteBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBinding", DeleteBindingResponse.class);
    }

    /**
     *本接口（DeleteDevice）用于删除设备，可进行批量操作，每次操作最多100台设备。
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *本接口（DeleteIotDataType）用于删除自定义物模型数据类型。
     * @param req DeleteIotDataTypeRequest
     * @return DeleteIotDataTypeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIotDataTypeResponse DeleteIotDataType(DeleteIotDataTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIotDataType", DeleteIotDataTypeResponse.class);
    }

    /**
     *本接口（DeleteMessageQueue）用于删除物联网智能视频产品的转发消息配置信息。
     * @param req DeleteMessageQueueRequest
     * @return DeleteMessageQueueResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMessageQueueResponse DeleteMessageQueue(DeleteMessageQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMessageQueue", DeleteMessageQueueResponse.class);
    }

    /**
     *本接口（DeleteOtaVersion）用于删除固件版本信息。
     * @param req DeleteOtaVersionRequest
     * @return DeleteOtaVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOtaVersionResponse DeleteOtaVersion(DeleteOtaVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOtaVersion", DeleteOtaVersionResponse.class);
    }

    /**
     *本接口（DeleteProduct）用于删除一个物联网智能视频产品。
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProduct", DeleteProductResponse.class);
    }

    /**
     *本接口（DeleteTraceIds）用于将设备从日志跟踪白名单中删除，该接口可批量操作，最多支持同时操作100台设备。
     * @param req DeleteTraceIdsRequest
     * @return DeleteTraceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTraceIdsResponse DeleteTraceIds(DeleteTraceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTraceIds", DeleteTraceIdsResponse.class);
    }

    /**
     *将已购买的云存服务转移到另一设备
     * @param req DeliverStorageServiceRequest
     * @return DeliverStorageServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeliverStorageServiceResponse DeliverStorageService(DeliverStorageServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeliverStorageService", DeliverStorageServiceResponse.class);
    }

    /**
     *客户可通过本接口获取账户余额信息, 默认接口请求频率限制：1次/秒
     * @param req DescribeAccountBalanceRequest
     * @return DescribeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountBalanceResponse DescribeAccountBalance(DescribeAccountBalanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountBalance", DescribeAccountBalanceResponse.class);
    }

    /**
     *本接口（DescribeBindDev）用于查询终端用户绑定的设备列表。
     * @param req DescribeBindDevRequest
     * @return DescribeBindDevResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindDevResponse DescribeBindDev(DescribeBindDevRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindDev", DescribeBindDevResponse.class);
    }

    /**
     *本接口（DescribeBindUsr）用于查询设备被分享的所有用户列表。
     * @param req DescribeBindUsrRequest
     * @return DescribeBindUsrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindUsrResponse DescribeBindUsr(DescribeBindUsrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindUsr", DescribeBindUsrResponse.class);
    }

    /**
     *本接口（DescribeDevice）获取设备信息。
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevice", DescribeDeviceResponse.class);
    }

    /**
     *本接口（DescribeDeviceModel）用于获取设备物模型。
     * @param req DescribeDeviceModelRequest
     * @return DescribeDeviceModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceModelResponse DescribeDeviceModel(DescribeDeviceModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceModel", DescribeDeviceModelResponse.class);
    }

    /**
     *本接口（DescribeDevices）用于获取设备信息列表。
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *本接口（DescribeIotDataType）用于查询自定义的物模型数据类型。
     * @param req DescribeIotDataTypeRequest
     * @return DescribeIotDataTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotDataTypeResponse DescribeIotDataType(DescribeIotDataTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIotDataType", DescribeIotDataTypeResponse.class);
    }

    /**
     *本接口（DescribeIotModel）用于获取物模型定义详情。
     * @param req DescribeIotModelRequest
     * @return DescribeIotModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotModelResponse DescribeIotModel(DescribeIotModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIotModel", DescribeIotModelResponse.class);
    }

    /**
     *本接口（DescribeIotModels）用于列出物模型历史版本列表。
     * @param req DescribeIotModelsRequest
     * @return DescribeIotModelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotModelsResponse DescribeIotModels(DescribeIotModelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIotModels", DescribeIotModelsResponse.class);
    }

    /**
     *本接口（DescribeLogs）用于查询设备日志列表。
设备日志最长保留时长为15天,超期自动清除。
     * @param req DescribeLogsRequest
     * @return DescribeLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsResponse DescribeLogs(DescribeLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogs", DescribeLogsResponse.class);
    }

    /**
     *本接口（DescribeMessageQueue）用于查询物联网智能视频产品转发消息配置。
     * @param req DescribeMessageQueueRequest
     * @return DescribeMessageQueueResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageQueueResponse DescribeMessageQueue(DescribeMessageQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageQueue", DescribeMessageQueueResponse.class);
    }

    /**
     *本接口（DescribeModelDataRet）用于根据TaskId获取对设备物模型操作最终响应的结果。
     * @param req DescribeModelDataRetRequest
     * @return DescribeModelDataRetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelDataRetResponse DescribeModelDataRet(DescribeModelDataRetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelDataRet", DescribeModelDataRetResponse.class);
    }

    /**
     *查看操作系统支持的芯片列表
     * @param req DescribeOsListRequest
     * @return DescribeOsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOsListResponse DescribeOsList(DescribeOsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOsList", DescribeOsListResponse.class);
    }

    /**
     *本接口（DescribeOtaVersions）用于查询固件版本信息列表。
     * @param req DescribeOtaVersionsRequest
     * @return DescribeOtaVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtaVersionsResponse DescribeOtaVersions(DescribeOtaVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtaVersions", DescribeOtaVersionsResponse.class);
    }

    /**
     *本接口（DescribeProduct）用于获取单个产品的详细信息。
     * @param req DescribeProductRequest
     * @return DescribeProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResponse DescribeProduct(DescribeProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProduct", DescribeProductResponse.class);
    }

    /**
     *本接口（DescribeProducts）用于列出用户账号下的物联网智能视频产品列表。
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducts", DescribeProductsResponse.class);
    }

    /**
     *本接口（DescribePubVersions）用于获取某一产品发布过的全部固件版本。
     * @param req DescribePubVersionsRequest
     * @return DescribePubVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePubVersionsResponse DescribePubVersions(DescribePubVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePubVersions", DescribePubVersionsResponse.class);
    }

    /**
     *客户可通过本接口获取充值记录信息, 一次最多返回50条记录。
     * @param req DescribeRechargeRecordsRequest
     * @return DescribeRechargeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRechargeRecordsResponse DescribeRechargeRecords(DescribeRechargeRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRechargeRecords", DescribeRechargeRecordsResponse.class);
    }

    /**
     *本接口（DescribeRegistrationStatus）用于查询终端用户的注册状态。
     * @param req DescribeRegistrationStatusRequest
     * @return DescribeRegistrationStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistrationStatusResponse DescribeRegistrationStatus(DescribeRegistrationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistrationStatus", DescribeRegistrationStatusResponse.class);
    }

    /**
     *本接口（DescribeRunLog）用于获取设备运行日志。
     * @param req DescribeRunLogRequest
     * @return DescribeRunLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunLogResponse DescribeRunLog(DescribeRunLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRunLog", DescribeRunLogResponse.class);
    }

    /**
     *查询云存服务
     * @param req DescribeStorageServiceRequest
     * @return DescribeStorageServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStorageServiceResponse DescribeStorageService(DescribeStorageServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStorageService", DescribeStorageServiceResponse.class);
    }

    /**
     *请求设备直播流地址
     * @param req DescribeStreamRequest
     * @return DescribeStreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamResponse DescribeStream(DescribeStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStream", DescribeStreamResponse.class);
    }

    /**
     *本接口（DescribeTraceIds）用于查询设备日志跟踪白名单。
     * @param req DescribeTraceIdsRequest
     * @return DescribeTraceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceIdsResponse DescribeTraceIds(DescribeTraceIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTraceIds", DescribeTraceIdsResponse.class);
    }

    /**
     *本接口（DescribeTraceStatus）用于查询指定设备是否在白名单中。
     * @param req DescribeTraceStatusRequest
     * @return DescribeTraceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTraceStatusResponse DescribeTraceStatus(DescribeTraceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTraceStatus", DescribeTraceStatusResponse.class);
    }

    /**
     *本接口（DisableDevice）用于禁用设备，可进行批量操作，每次操作最多100台设备。
     * @param req DisableDeviceRequest
     * @return DisableDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DisableDeviceResponse DisableDevice(DisableDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableDevice", DisableDeviceResponse.class);
    }

    /**
     *本接口（DisableDeviceStream）用于停止设备推流，可进行批量操作，每次操作最多100台设备。
     * @param req DisableDeviceStreamRequest
     * @return DisableDeviceStreamResponse
     * @throws TencentCloudSDKException
     */
    public DisableDeviceStreamResponse DisableDeviceStream(DisableDeviceStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableDeviceStream", DisableDeviceStreamResponse.class);
    }

    /**
     *本接口（DisableOtaVersion）用于禁用固件版本。
     * @param req DisableOtaVersionRequest
     * @return DisableOtaVersionResponse
     * @throws TencentCloudSDKException
     */
    public DisableOtaVersionResponse DisableOtaVersion(DisableOtaVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableOtaVersion", DisableOtaVersionResponse.class);
    }

    /**
     *修改设备信息
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDevice", ModifyDeviceResponse.class);
    }

    /**
     *本接口（ModifyDeviceAction）用于修改设备物模型的行为（Action）。

可对ctlVal数据属性进行写入,如:Action.takePhoto.ctlVal,设备在线且成功发送到设备才返回,物模型写入数据时,不需要传入时标信息,平台以当前时标作为数据的时标更新物模型中的时标信息。
注意:
  1.若设备当前不在线,会直接返回错误
  2.若设备网络出现异常时,消息发送可能超时,超时等待最长时间为3秒
  3.value的内容必须与实际物模型的定义一致
     * @param req ModifyDeviceActionRequest
     * @return ModifyDeviceActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceActionResponse ModifyDeviceAction(ModifyDeviceActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceAction", ModifyDeviceActionResponse.class);
    }

    /**
     *本接口（ModifyDeviceProperty）用于修改设备物模型的属性（ProWritable）。
可对setVal数据属性进行写入,如:
ProWritable.Pos.setVal
对于嵌套类型的可写属性，可以仅对其部分数据内容进行写入，如:
ProWritable.Pos.setVal.x;
可写属性云端写入成功即返回;云端向设备端发布属性变更参数;若当前设备不在线,在设备下次上线时会自动更新这些属性参数;
物模型写入数据时,不需要传入时标信息,平台以当前时标作为数据的时标更新物模型中的时标信息。
     * @param req ModifyDevicePropertyRequest
     * @return ModifyDevicePropertyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDevicePropertyResponse ModifyDeviceProperty(ModifyDevicePropertyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceProperty", ModifyDevicePropertyResponse.class);
    }

    /**
     *本接口（ModifyProduct）用于编辑物联网智能视频产品的相关信息。
     * @param req ModifyProductRequest
     * @return ModifyProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductResponse ModifyProduct(ModifyProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProduct", ModifyProductResponse.class);
    }

    /**
     *编辑版本描述信息
     * @param req ModifyVerContentRequest
     * @return ModifyVerContentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVerContentResponse ModifyVerContent(ModifyVerContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVerContent", ModifyVerContentResponse.class);
    }

    /**
     *本接口（RefundStorageService）用于退订已购买的云存服务。
退订时，云存服务对应订单的处理方式 : 
1. 未开始的订单自动回到已付费订单池
2. 已开始的订单自动失效
3. 购买云存接口,优先从已付费订单池中分配订单
     * @param req RefundStorageServiceRequest
     * @return RefundStorageServiceResponse
     * @throws TencentCloudSDKException
     */
    public RefundStorageServiceResponse RefundStorageService(RefundStorageServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefundStorageService", RefundStorageServiceResponse.class);
    }

    /**
     *设备刷新cos上传证书
     * @param req RenewUploadTestRequest
     * @return RenewUploadTestResponse
     * @throws TencentCloudSDKException
     */
    public RenewUploadTestResponse RenewUploadTest(RenewUploadTestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewUploadTest", RenewUploadTestResponse.class);
    }

    /**
     *本接口（RunDevice）用于启用设备，可进行批量操作，每次操作最多100台设备。
     * @param req RunDeviceRequest
     * @return RunDeviceResponse
     * @throws TencentCloudSDKException
     */
    public RunDeviceResponse RunDevice(RunDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunDevice", RunDeviceResponse.class);
    }

    /**
     *本接口（RunDeviceStream）用于开启设备推流，可进行批量操作，每次操作最多100台设备。
     * @param req RunDeviceStreamRequest
     * @return RunDeviceStreamResponse
     * @throws TencentCloudSDKException
     */
    public RunDeviceStreamResponse RunDeviceStream(RunDeviceStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunDeviceStream", RunDeviceStreamResponse.class);
    }

    /**
     *本接口（RunIotModel）用于对定义的物模型进行发布。
     * @param req RunIotModelRequest
     * @return RunIotModelResponse
     * @throws TencentCloudSDKException
     */
    public RunIotModelResponse RunIotModel(RunIotModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunIotModel", RunIotModelResponse.class);
    }

    /**
     *本接口（RunOtaVersion）用于固件版本正式发布。
     * @param req RunOtaVersionRequest
     * @return RunOtaVersionResponse
     * @throws TencentCloudSDKException
     */
    public RunOtaVersionResponse RunOtaVersion(RunOtaVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunOtaVersion", RunOtaVersionResponse.class);
    }

    /**
     *本接口（RunTestOtaVersion）用于固件版本测试发布。
     * @param req RunTestOtaVersionRequest
     * @return RunTestOtaVersionResponse
     * @throws TencentCloudSDKException
     */
    public RunTestOtaVersionResponse RunTestOtaVersion(RunTestOtaVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunTestOtaVersion", RunTestOtaVersionResponse.class);
    }

    /**
     *本接口（SendOnlineMsg）用于向设备发送在线消息。
注意：
若设备当前不在线,会直接返回错误;
若设备网络出现异常时,消息发送可能超时,超时等待最长时间为3秒.waitresp非0情况下,会导致本接口阻塞3秒。
     * @param req SendOnlineMsgRequest
     * @return SendOnlineMsgResponse
     * @throws TencentCloudSDKException
     */
    public SendOnlineMsgResponse SendOnlineMsg(SendOnlineMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendOnlineMsg", SendOnlineMsgResponse.class);
    }

    /**
     *本接口（SetMessageQueue）用于配置物联网智能视频产品的转发消息队列。
     * @param req SetMessageQueueRequest
     * @return SetMessageQueueResponse
     * @throws TencentCloudSDKException
     */
    public SetMessageQueueResponse SetMessageQueue(SetMessageQueueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetMessageQueue", SetMessageQueueResponse.class);
    }

    /**
     *本接口（UpgradeDevice）用于对设备进行固件升级。
该接口向指定的设备下发固件更新指令,可将固件升级到任意版本(可实现固件降级)。
警告:使能UpgradeNow参数存在一定的风险性！建议仅在debug场景下使用!
     * @param req UpgradeDeviceRequest
     * @return UpgradeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeDeviceResponse UpgradeDevice(UpgradeDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeDevice", UpgradeDeviceResponse.class);
    }

    /**
     *本接口（UploadOtaVersion）接收上传到控制台的固件版本信息。
     * @param req UploadOtaVersionRequest
     * @return UploadOtaVersionResponse
     * @throws TencentCloudSDKException
     */
    public UploadOtaVersionResponse UploadOtaVersion(UploadOtaVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadOtaVersion", UploadOtaVersionResponse.class);
    }

}
