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
package com.tencentcloudapi.weilingwith.v20230427;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.weilingwith.v20230427.models.*;

public class WeilingwithClient extends AbstractClient{
    private static String endpoint = "weilingwith.tencentcloudapi.com";
    private static String service = "weilingwith";
    private static String version = "2023-04-27";

    public WeilingwithClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WeilingwithClient(Credential credential, String region, ClientProfile profile) {
        super(WeilingwithClient.endpoint, WeilingwithClient.version, credential, region, profile);
    }

    /**
     *添加告警处理记录
     * @param req AddAlarmProcessRecordRequest
     * @return AddAlarmProcessRecordResponse
     * @throws TencentCloudSDKException
     */
    public AddAlarmProcessRecordResponse AddAlarmProcessRecord(AddAlarmProcessRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAlarmProcessRecord", AddAlarmProcessRecordResponse.class);
    }

    /**
     *单个/批量新增设备
     * @param req BatchCreateDeviceRequest
     * @return BatchCreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateDeviceResponse BatchCreateDevice(BatchCreateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateDevice", BatchCreateDeviceResponse.class);
    }

    /**
     *批量删除设备
     * @param req BatchDeleteDeviceRequest
     * @return BatchDeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteDeviceResponse BatchDeleteDevice(BatchDeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteDevice", BatchDeleteDeviceResponse.class);
    }

    /**
     *批量消警
     * @param req BatchKillAlarmRequest
     * @return BatchKillAlarmResponse
     * @throws TencentCloudSDKException
     */
    public BatchKillAlarmResponse BatchKillAlarm(BatchKillAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchKillAlarm", BatchKillAlarmResponse.class);
    }

    /**
     *批量上报应用消息
     * @param req BatchReportAppMessageRequest
     * @return BatchReportAppMessageResponse
     * @throws TencentCloudSDKException
     */
    public BatchReportAppMessageResponse BatchReportAppMessage(BatchReportAppMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchReportAppMessage", BatchReportAppMessageResponse.class);
    }

    /**
     *变更告警状态
     * @param req ChangeAlarmStatusRequest
     * @return ChangeAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeAlarmStatusResponse ChangeAlarmStatus(ChangeAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeAlarmStatus", ChangeAlarmStatusResponse.class);
    }

    /**
     *云台控制
     * @param req ControlCameraPTZRequest
     * @return ControlCameraPTZResponse
     * @throws TencentCloudSDKException
     */
    public ControlCameraPTZResponse ControlCameraPTZ(ControlCameraPTZRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlCameraPTZ", ControlCameraPTZResponse.class);
    }

    /**
     *设备控制（单个、批量控制）
     * @param req ControlDeviceRequest
     * @return ControlDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceResponse ControlDevice(ControlDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDevice", ControlDeviceResponse.class);
    }

    /**
     *调用方应用，创建调用租户API的授权令牌。
     * @param req CreateApplicationTokenRequest
     * @return CreateApplicationTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationTokenResponse CreateApplicationToken(CreateApplicationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationToken", CreateApplicationTokenResponse.class);
    }

    /**
     *删除设备分组
     * @param req DeleteDeviceGroupRequest
     * @return DeleteDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceGroupResponse DeleteDeviceGroup(DeleteDeviceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceGroup", DeleteDeviceGroupResponse.class);
    }

    /**
     *动作列表查询
     * @param req DescribeActionListRequest
     * @return DescribeActionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActionListResponse DescribeActionList(DescribeActionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActionList", DescribeActionListResponse.class);
    }

    /**
     *根据标签获取行政区划列表
     * @param req DescribeAdministrationByTagRequest
     * @return DescribeAdministrationByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAdministrationByTagResponse DescribeAdministrationByTag(DescribeAdministrationByTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAdministrationByTag", DescribeAdministrationByTagResponse.class);
    }

    /**
     *告警级别枚举获取
     * @param req DescribeAlarmLevelListRequest
     * @return DescribeAlarmLevelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmLevelListResponse DescribeAlarmLevelList(DescribeAlarmLevelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmLevelList", DescribeAlarmLevelListResponse.class);
    }

    /**
     *告警列表查询
     * @param req DescribeAlarmListRequest
     * @return DescribeAlarmListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmListResponse DescribeAlarmList(DescribeAlarmListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmList", DescribeAlarmListResponse.class);
    }

    /**
     *用来查询系统中的告警状态列表
     * @param req DescribeAlarmStatusListRequest
     * @return DescribeAlarmStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmStatusListResponse DescribeAlarmStatusList(DescribeAlarmStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmStatusList", DescribeAlarmStatusListResponse.class);
    }

    /**
     *告警类型获取
     * @param req DescribeAlarmTypeListRequest
     * @return DescribeAlarmTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmTypeListResponse DescribeAlarmTypeList(DescribeAlarmTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmTypeList", DescribeAlarmTypeListResponse.class);
    }

    /**
     *查询指定空间关联的应用列表
     * @param req DescribeApplicationListRequest
     * @return DescribeApplicationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationListResponse DescribeApplicationList(DescribeApplicationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationList", DescribeApplicationListResponse.class);
    }

    /**
     *查询建筑列表
     * @param req DescribeBuildingListRequest
     * @return DescribeBuildingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBuildingListResponse DescribeBuildingList(DescribeBuildingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBuildingList", DescribeBuildingListResponse.class);
    }

    /**
     *查询建筑三维模型
     * @param req DescribeBuildingModelRequest
     * @return DescribeBuildingModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBuildingModelResponse DescribeBuildingModel(DescribeBuildingModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBuildingModel", DescribeBuildingModelResponse.class);
    }

    /**
     *查询建筑信息
     * @param req DescribeBuildingProfileRequest
     * @return DescribeBuildingProfileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBuildingProfileResponse DescribeBuildingProfile(DescribeBuildingProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBuildingProfile", DescribeBuildingProfileResponse.class);
    }

    /**
     *获取视频扩展信息
     * @param req DescribeCameraExtendInfoRequest
     * @return DescribeCameraExtendInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCameraExtendInfoResponse DescribeCameraExtendInfo(DescribeCameraExtendInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCameraExtendInfo", DescribeCameraExtendInfoResponse.class);
    }

    /**
     *设备分组列表
     * @param req DescribeDeviceGroupListRequest
     * @return DescribeDeviceGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceGroupListResponse DescribeDeviceGroupList(DescribeDeviceGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceGroupList", DescribeDeviceGroupListResponse.class);
    }

    /**
     *设备列表查询/单个查询（支持通过筛选条件查询，设备类型、标签、PID、空间）
     * @param req DescribeDeviceListRequest
     * @return DescribeDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceListResponse DescribeDeviceList(DescribeDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceList", DescribeDeviceListResponse.class);
    }

    /**
     *获取设备影子数据
     * @param req DescribeDeviceShadowListRequest
     * @return DescribeDeviceShadowListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceShadowListResponse DescribeDeviceShadowList(DescribeDeviceShadowListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceShadowList", DescribeDeviceShadowListResponse.class);
    }

    /**
     *设备状态获取
     * @param req DescribeDeviceStatusListRequest
     * @return DescribeDeviceStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceStatusListResponse DescribeDeviceStatusList(DescribeDeviceStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceStatusList", DescribeDeviceStatusListResponse.class);
    }

    /**
     *设备状态统计
     * @param req DescribeDeviceStatusStatRequest
     * @return DescribeDeviceStatusStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceStatusStatResponse DescribeDeviceStatusStat(DescribeDeviceStatusStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceStatusStat", DescribeDeviceStatusStatResponse.class);
    }

    /**
     *标签列表查询
     * @param req DescribeDeviceTagListRequest
     * @return DescribeDeviceTagListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceTagListResponse DescribeDeviceTagList(DescribeDeviceTagListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceTagList", DescribeDeviceTagListResponse.class);
    }

    /**
     *拉取设备的设备类型列表
     * @param req DescribeDeviceTypeListRequest
     * @return DescribeDeviceTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceTypeListResponse DescribeDeviceTypeList(DescribeDeviceTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceTypeList", DescribeDeviceTypeListResponse.class);
    }

    /**
     *查询边缘应用凭证
     * @param req DescribeEdgeApplicationTokenRequest
     * @return DescribeEdgeApplicationTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeApplicationTokenResponse DescribeEdgeApplicationToken(DescribeEdgeApplicationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeApplicationToken", DescribeEdgeApplicationTokenResponse.class);
    }

    /**
     *查询分页构件信息
     * @param req DescribeElementProfilePageRequest
     * @return DescribeElementProfilePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeElementProfilePageResponse DescribeElementProfilePage(DescribeElementProfilePageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeElementProfilePage", DescribeElementProfilePageResponse.class);
    }

    /**
     *查询构件树
     * @param req DescribeElementProfileTreeRequest
     * @return DescribeElementProfileTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeElementProfileTreeResponse DescribeElementProfileTree(DescribeElementProfileTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeElementProfileTree", DescribeElementProfileTreeResponse.class);
    }

    /**
     *事件列表查询
     * @param req DescribeEventListRequest
     * @return DescribeEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventListResponse DescribeEventList(DescribeEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventList", DescribeEventListResponse.class);
    }

    /**
     *获取文件下载URL
     * @param req DescribeFileDownloadURLRequest
     * @return DescribeFileDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileDownloadURLResponse DescribeFileDownloadURL(DescribeFileDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileDownloadURL", DescribeFileDownloadURLResponse.class);
    }

    /**
     *文件上传接口
     * @param req DescribeFileUploadURLRequest
     * @return DescribeFileUploadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileUploadURLResponse DescribeFileUploadURL(DescribeFileUploadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileUploadURL", DescribeFileUploadURLResponse.class);
    }

    /**
     *查询接口列表
     * @param req DescribeInterfaceListRequest
     * @return DescribeInterfaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInterfaceListResponse DescribeInterfaceList(DescribeInterfaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInterfaceList", DescribeInterfaceListResponse.class);
    }

    /**
     *联动规则列表查询
     * @param req DescribeLinkRuleListRequest
     * @return DescribeLinkRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinkRuleListResponse DescribeLinkRuleList(DescribeLinkRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLinkRuleList", DescribeLinkRuleListResponse.class);
    }

    /**
     *模型列表查询/单个查询（产品模型/标准模型）
     * @param req DescribeModelListRequest
     * @return DescribeModelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelListResponse DescribeModelList(DescribeModelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelList", DescribeModelListResponse.class);
    }

    /**
     *产品列表查询
     * @param req DescribeProductListRequest
     * @return DescribeProductListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductListResponse DescribeProductList(DescribeProductListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductList", DescribeProductListResponse.class);
    }

    /**
     *查询构件属性（详情）
     * @param req DescribePropertyListRequest
     * @return DescribePropertyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePropertyListResponse DescribePropertyList(DescribePropertyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePropertyList", DescribePropertyListResponse.class);
    }

    /**
     *联动规则详情查询
     * @param req DescribeRuleDetailRequest
     * @return DescribeRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleDetailResponse DescribeRuleDetail(DescribeRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleDetail", DescribeRuleDetailResponse.class);
    }

    /**
     *查询场景列表
     * @param req DescribeSceneListRequest
     * @return DescribeSceneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSceneListResponse DescribeSceneList(DescribeSceneListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSceneList", DescribeSceneListResponse.class);
    }

    /**
     *查询指定空间设备编号列表
     * @param req DescribeSpaceDeviceIdListRequest
     * @return DescribeSpaceDeviceIdListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceDeviceIdListResponse DescribeSpaceDeviceIdList(DescribeSpaceDeviceIdListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceDeviceIdList", DescribeSpaceDeviceIdListResponse.class);
    }

    /**
     *查询指定空间下设备与构件绑定关系列表
     * @param req DescribeSpaceDeviceRelationListRequest
     * @return DescribeSpaceDeviceRelationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceDeviceRelationListResponse DescribeSpaceDeviceRelationList(DescribeSpaceDeviceRelationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceDeviceRelationList", DescribeSpaceDeviceRelationListResponse.class);
    }

    /**
     *查询设备绑定的空间信息
     * @param req DescribeSpaceInfoByDeviceIdRequest
     * @return DescribeSpaceInfoByDeviceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceInfoByDeviceIdResponse DescribeSpaceInfoByDeviceId(DescribeSpaceInfoByDeviceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceInfoByDeviceId", DescribeSpaceInfoByDeviceIdResponse.class);
    }

    /**
     *查询设备绑定的空间层级关系
     * @param req DescribeSpaceRelationByDeviceIdRequest
     * @return DescribeSpaceRelationByDeviceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceRelationByDeviceIdResponse DescribeSpaceRelationByDeviceId(DescribeSpaceRelationByDeviceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceRelationByDeviceId", DescribeSpaceRelationByDeviceIdResponse.class);
    }

    /**
     *查询空间分类
     * @param req DescribeSpaceTypeListRequest
     * @return DescribeSpaceTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceTypeListResponse DescribeSpaceTypeList(DescribeSpaceTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceTypeList", DescribeSpaceTypeListResponse.class);
    }

    /**
     *查询租户楼栋数量和楼栋建筑面积
     * @param req DescribeTenantBuildingCountAndAreaRequest
     * @return DescribeTenantBuildingCountAndAreaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTenantBuildingCountAndAreaResponse DescribeTenantBuildingCountAndArea(DescribeTenantBuildingCountAndAreaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTenantBuildingCountAndArea", DescribeTenantBuildingCountAndAreaResponse.class);
    }

    /**
     *查询租户组织部门列表
     * @param req DescribeTenantDepartmentListRequest
     * @return DescribeTenantDepartmentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTenantDepartmentListResponse DescribeTenantDepartmentList(DescribeTenantDepartmentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTenantDepartmentList", DescribeTenantDepartmentListResponse.class);
    }

    /**
     *查询租户人员列表
     * @param req DescribeTenantUserListRequest
     * @return DescribeTenantUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTenantUserListResponse DescribeTenantUserList(DescribeTenantUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTenantUserList", DescribeTenantUserListResponse.class);
    }

    /**
     *云录像接口
     * @param req DescribeVideoCloudRecordRequest
     * @return DescribeVideoCloudRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoCloudRecordResponse DescribeVideoCloudRecord(DescribeVideoCloudRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoCloudRecord", DescribeVideoCloudRecordResponse.class);
    }

    /**
     *实时流接口
     * @param req DescribeVideoLiveStreamRequest
     * @return DescribeVideoLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoLiveStreamResponse DescribeVideoLiveStream(DescribeVideoLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoLiveStream", DescribeVideoLiveStreamResponse.class);
    }

    /**
     *历史流接口
     * @param req DescribeVideoRecordStreamRequest
     * @return DescribeVideoRecordStreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoRecordStreamResponse DescribeVideoRecordStream(DescribeVideoRecordStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoRecordStream", DescribeVideoRecordStreamResponse.class);
    }

    /**
     *查询项目空间楼栋数量与建筑面积
     * @param req DescribeWorkSpaceBuildingCountAndAreaRequest
     * @return DescribeWorkSpaceBuildingCountAndAreaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkSpaceBuildingCountAndAreaResponse DescribeWorkSpaceBuildingCountAndArea(DescribeWorkSpaceBuildingCountAndAreaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkSpaceBuildingCountAndArea", DescribeWorkSpaceBuildingCountAndAreaResponse.class);
    }

    /**
     *获取租户下的空间列表
     * @param req DescribeWorkspaceListRequest
     * @return DescribeWorkspaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceListResponse DescribeWorkspaceList(DescribeWorkspaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceList", DescribeWorkspaceListResponse.class);
    }

    /**
     *查询项目空间人员列表
     * @param req DescribeWorkspaceUserListRequest
     * @return DescribeWorkspaceUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceUserListResponse DescribeWorkspaceUserList(DescribeWorkspaceUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceUserList", DescribeWorkspaceUserListResponse.class);
    }

    /**
     *批量修改设备自定义字段值
     * @param req ModifyDeviceFieldRequest
     * @return ModifyDeviceFieldResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceFieldResponse ModifyDeviceField(ModifyDeviceFieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceField", ModifyDeviceFieldResponse.class);
    }

    /**
     *批量修改设备组
     * @param req ModifyDeviceGroupRequest
     * @return ModifyDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceGroupResponse ModifyDeviceGroup(ModifyDeviceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceGroup", ModifyDeviceGroupResponse.class);
    }

    /**
     *批量修改设备名字
     * @param req ModifyDeviceNameRequest
     * @return ModifyDeviceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceNameResponse ModifyDeviceName(ModifyDeviceNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceName", ModifyDeviceNameResponse.class);
    }

    /**
     *批量修改设备标签
     * @param req ModifyDeviceTagRequest
     * @return ModifyDeviceTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceTagResponse ModifyDeviceTag(ModifyDeviceTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceTag", ModifyDeviceTagResponse.class);
    }

    /**
     *上报应用消息
     * @param req ReportAppMessageRequest
     * @return ReportAppMessageResponse
     * @throws TencentCloudSDKException
     */
    public ReportAppMessageResponse ReportAppMessage(ReportAppMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportAppMessage", ReportAppMessageResponse.class);
    }

    /**
     *设备分组新增/修改
     * @param req SaveDeviceGroupRequest
     * @return SaveDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public SaveDeviceGroupResponse SaveDeviceGroup(SaveDeviceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveDeviceGroup", SaveDeviceGroupResponse.class);
    }

    /**
     *断流接口
     * @param req StopVideoStreamingRequest
     * @return StopVideoStreamingResponse
     * @throws TencentCloudSDKException
     */
    public StopVideoStreamingResponse StopVideoStreaming(StopVideoStreamingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopVideoStreaming", StopVideoStreamingResponse.class);
    }

    /**
     *修改工作空间园区属性
     * @param req UpdateWorkspaceParkAttributesRequest
     * @return UpdateWorkspaceParkAttributesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkspaceParkAttributesResponse UpdateWorkspaceParkAttributes(UpdateWorkspaceParkAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkspaceParkAttributes", UpdateWorkspaceParkAttributesResponse.class);
    }

}
