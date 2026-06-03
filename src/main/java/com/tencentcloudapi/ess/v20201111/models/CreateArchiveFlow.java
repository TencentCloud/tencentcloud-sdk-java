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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateArchiveFlow extends AbstractModel {

    /**
    * <p>合同文件的资源id，使用<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a> 上传文件返回resourceId，目前一个合同只能支持一个资源ID。</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>合同名称，不传时系统会使用合同资源文件名作为合同名称；最终合同名称不能为空；长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>合同类型，自定义文本字符串，长度不能超过200。</p>
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * <p>调用方业务系统中的合同业务编号，可以用于外部系统和归档合同做关联，长度不超过 128 字节</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * <p>合同发起方/创建人名称，用于归档合同展示和检索，长度不超过 32 字符</p>
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * <p>签署人信息列表，用于记录合同由哪些个人或企业签署，最多 50 个参与者。</p>
    */
    @SerializedName("ApproverInfo")
    @Expose
    private ArchiveFlowApproverInfo [] ApproverInfo;

    /**
    * <p>关注人信息列表，用于记录合同关注对象，最多 50 个关注者。</p>
    */
    @SerializedName("CcInfo")
    @Expose
    private ArchiveFlowApproverInfo [] CcInfo;

    /**
    * <p>调用方自定义透传数据，可用于保存业务扩展信息，长度不超过 20480 字节。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>合同描述/备注信息，长度不超过 1000 个字符</p>
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * <p>合同签署完成时间，Unix 秒级时间戳</p>
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
    * <p>合同发起时间/合同原始创建时间，Unix 秒级时间戳</p>
    */
    @SerializedName("CustomCreatedOn")
    @Expose
    private Long CustomCreatedOn;

    /**
     * Get <p>合同文件的资源id，使用<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a> 上传文件返回resourceId，目前一个合同只能支持一个资源ID。</p> 
     * @return ResourceIds <p>合同文件的资源id，使用<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a> 上传文件返回resourceId，目前一个合同只能支持一个资源ID。</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>合同文件的资源id，使用<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a> 上传文件返回resourceId，目前一个合同只能支持一个资源ID。</p>
     * @param ResourceIds <p>合同文件的资源id，使用<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles" target="_blank">UploadFiles</a> 上传文件返回resourceId，目前一个合同只能支持一个资源ID。</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>合同名称，不传时系统会使用合同资源文件名作为合同名称；最终合同名称不能为空；长度不能超过200，只能由中文、字母、数字和下划线组成。</p> 
     * @return FlowName <p>合同名称，不传时系统会使用合同资源文件名作为合同名称；最终合同名称不能为空；长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>合同名称，不传时系统会使用合同资源文件名作为合同名称；最终合同名称不能为空；长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     * @param FlowName <p>合同名称，不传时系统会使用合同资源文件名作为合同名称；最终合同名称不能为空；长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>合同类型，自定义文本字符串，长度不能超过200。</p> 
     * @return FlowType <p>合同类型，自定义文本字符串，长度不能超过200。</p>
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set <p>合同类型，自定义文本字符串，长度不能超过200。</p>
     * @param FlowType <p>合同类型，自定义文本字符串，长度不能超过200。</p>
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get <p>调用方业务系统中的合同业务编号，可以用于外部系统和归档合同做关联，长度不超过 128 字节</p> 
     * @return BusinessId <p>调用方业务系统中的合同业务编号，可以用于外部系统和归档合同做关联，长度不超过 128 字节</p>
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>调用方业务系统中的合同业务编号，可以用于外部系统和归档合同做关联，长度不超过 128 字节</p>
     * @param BusinessId <p>调用方业务系统中的合同业务编号，可以用于外部系统和归档合同做关联，长度不超过 128 字节</p>
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>合同发起方/创建人名称，用于归档合同展示和检索，长度不超过 32 字符</p> 
     * @return CreatorName <p>合同发起方/创建人名称，用于归档合同展示和检索，长度不超过 32 字符</p>
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set <p>合同发起方/创建人名称，用于归档合同展示和检索，长度不超过 32 字符</p>
     * @param CreatorName <p>合同发起方/创建人名称，用于归档合同展示和检索，长度不超过 32 字符</p>
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get <p>签署人信息列表，用于记录合同由哪些个人或企业签署，最多 50 个参与者。</p> 
     * @return ApproverInfo <p>签署人信息列表，用于记录合同由哪些个人或企业签署，最多 50 个参与者。</p>
     */
    public ArchiveFlowApproverInfo [] getApproverInfo() {
        return this.ApproverInfo;
    }

    /**
     * Set <p>签署人信息列表，用于记录合同由哪些个人或企业签署，最多 50 个参与者。</p>
     * @param ApproverInfo <p>签署人信息列表，用于记录合同由哪些个人或企业签署，最多 50 个参与者。</p>
     */
    public void setApproverInfo(ArchiveFlowApproverInfo [] ApproverInfo) {
        this.ApproverInfo = ApproverInfo;
    }

    /**
     * Get <p>关注人信息列表，用于记录合同关注对象，最多 50 个关注者。</p> 
     * @return CcInfo <p>关注人信息列表，用于记录合同关注对象，最多 50 个关注者。</p>
     */
    public ArchiveFlowApproverInfo [] getCcInfo() {
        return this.CcInfo;
    }

    /**
     * Set <p>关注人信息列表，用于记录合同关注对象，最多 50 个关注者。</p>
     * @param CcInfo <p>关注人信息列表，用于记录合同关注对象，最多 50 个关注者。</p>
     */
    public void setCcInfo(ArchiveFlowApproverInfo [] CcInfo) {
        this.CcInfo = CcInfo;
    }

    /**
     * Get <p>调用方自定义透传数据，可用于保存业务扩展信息，长度不超过 20480 字节。</p> 
     * @return UserData <p>调用方自定义透传数据，可用于保存业务扩展信息，长度不超过 20480 字节。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>调用方自定义透传数据，可用于保存业务扩展信息，长度不超过 20480 字节。</p>
     * @param UserData <p>调用方自定义透传数据，可用于保存业务扩展信息，长度不超过 20480 字节。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>合同描述/备注信息，长度不超过 1000 个字符</p> 
     * @return FlowDescription <p>合同描述/备注信息，长度不超过 1000 个字符</p>
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set <p>合同描述/备注信息，长度不超过 1000 个字符</p>
     * @param FlowDescription <p>合同描述/备注信息，长度不超过 1000 个字符</p>
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get <p>合同签署完成时间，Unix 秒级时间戳</p> 
     * @return ApproveTime <p>合同签署完成时间，Unix 秒级时间戳</p>
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set <p>合同签署完成时间，Unix 秒级时间戳</p>
     * @param ApproveTime <p>合同签署完成时间，Unix 秒级时间戳</p>
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get <p>合同发起时间/合同原始创建时间，Unix 秒级时间戳</p> 
     * @return CustomCreatedOn <p>合同发起时间/合同原始创建时间，Unix 秒级时间戳</p>
     */
    public Long getCustomCreatedOn() {
        return this.CustomCreatedOn;
    }

    /**
     * Set <p>合同发起时间/合同原始创建时间，Unix 秒级时间戳</p>
     * @param CustomCreatedOn <p>合同发起时间/合同原始创建时间，Unix 秒级时间戳</p>
     */
    public void setCustomCreatedOn(Long CustomCreatedOn) {
        this.CustomCreatedOn = CustomCreatedOn;
    }

    public CreateArchiveFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateArchiveFlow(CreateArchiveFlow source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.ApproverInfo != null) {
            this.ApproverInfo = new ArchiveFlowApproverInfo[source.ApproverInfo.length];
            for (int i = 0; i < source.ApproverInfo.length; i++) {
                this.ApproverInfo[i] = new ArchiveFlowApproverInfo(source.ApproverInfo[i]);
            }
        }
        if (source.CcInfo != null) {
            this.CcInfo = new ArchiveFlowApproverInfo[source.CcInfo.length];
            for (int i = 0; i < source.CcInfo.length; i++) {
                this.CcInfo[i] = new ArchiveFlowApproverInfo(source.CcInfo[i]);
            }
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new Long(source.ApproveTime);
        }
        if (source.CustomCreatedOn != null) {
            this.CustomCreatedOn = new Long(source.CustomCreatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamArrayObj(map, prefix + "ApproverInfo.", this.ApproverInfo);
        this.setParamArrayObj(map, prefix + "CcInfo.", this.CcInfo);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "CustomCreatedOn", this.CustomCreatedOn);

    }
}

