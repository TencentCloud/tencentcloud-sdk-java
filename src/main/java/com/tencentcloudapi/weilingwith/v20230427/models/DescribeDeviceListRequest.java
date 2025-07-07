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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceListRequest extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 分页查询，第几页，必传，大于0
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页条数，必传大于0
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 设备类型，非必填
    */
    @SerializedName("DeviceTypeSet")
    @Expose
    private String [] DeviceTypeSet;

    /**
    * 产品 pid，非必填
    */
    @SerializedName("ProductIdSet")
    @Expose
    private Long [] ProductIdSet;

    /**
    * 设备标签，非必填
    */
    @SerializedName("TagIdSet")
    @Expose
    private Long [] TagIdSet;

    /**
    * 空间层级
    */
    @SerializedName("SpaceCodeSet")
    @Expose
    private String [] SpaceCodeSet;

    /**
    * 设备标签名，非必填
    */
    @SerializedName("DeviceTagSet")
    @Expose
    private String [] DeviceTagSet;

    /**
    * 设备wid,非必填
    */
    @SerializedName("WIDSet")
    @Expose
    private String [] WIDSet;

    /**
    * 自定义字段
    */
    @SerializedName("Field")
    @Expose
    private CustomField Field;

    /**
    * 分组id列表，非必填
    */
    @SerializedName("GroupIdSet")
    @Expose
    private Long [] GroupIdSet;

    /**
    * 是否激活，默认全部，"1"激活，"0"未激活
    */
    @SerializedName("IsActive")
    @Expose
    private String IsActive;

    /**
    * 是否为摄像头，默认全部，"true"摄像头，"false"非摄像头
    */
    @SerializedName("IsCamera")
    @Expose
    private String IsCamera;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 分页查询，第几页，必传，大于0 
     * @return PageNumber 分页查询，第几页，必传，大于0
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页查询，第几页，必传，大于0
     * @param PageNumber 分页查询，第几页，必传，大于0
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页条数，必传大于0 
     * @return PageSize 每页条数，必传大于0
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数，必传大于0
     * @param PageSize 每页条数，必传大于0
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 设备类型，非必填 
     * @return DeviceTypeSet 设备类型，非必填
     */
    public String [] getDeviceTypeSet() {
        return this.DeviceTypeSet;
    }

    /**
     * Set 设备类型，非必填
     * @param DeviceTypeSet 设备类型，非必填
     */
    public void setDeviceTypeSet(String [] DeviceTypeSet) {
        this.DeviceTypeSet = DeviceTypeSet;
    }

    /**
     * Get 产品 pid，非必填 
     * @return ProductIdSet 产品 pid，非必填
     */
    public Long [] getProductIdSet() {
        return this.ProductIdSet;
    }

    /**
     * Set 产品 pid，非必填
     * @param ProductIdSet 产品 pid，非必填
     */
    public void setProductIdSet(Long [] ProductIdSet) {
        this.ProductIdSet = ProductIdSet;
    }

    /**
     * Get 设备标签，非必填 
     * @return TagIdSet 设备标签，非必填
     */
    public Long [] getTagIdSet() {
        return this.TagIdSet;
    }

    /**
     * Set 设备标签，非必填
     * @param TagIdSet 设备标签，非必填
     */
    public void setTagIdSet(Long [] TagIdSet) {
        this.TagIdSet = TagIdSet;
    }

    /**
     * Get 空间层级 
     * @return SpaceCodeSet 空间层级
     */
    public String [] getSpaceCodeSet() {
        return this.SpaceCodeSet;
    }

    /**
     * Set 空间层级
     * @param SpaceCodeSet 空间层级
     */
    public void setSpaceCodeSet(String [] SpaceCodeSet) {
        this.SpaceCodeSet = SpaceCodeSet;
    }

    /**
     * Get 设备标签名，非必填 
     * @return DeviceTagSet 设备标签名，非必填
     */
    public String [] getDeviceTagSet() {
        return this.DeviceTagSet;
    }

    /**
     * Set 设备标签名，非必填
     * @param DeviceTagSet 设备标签名，非必填
     */
    public void setDeviceTagSet(String [] DeviceTagSet) {
        this.DeviceTagSet = DeviceTagSet;
    }

    /**
     * Get 设备wid,非必填 
     * @return WIDSet 设备wid,非必填
     */
    public String [] getWIDSet() {
        return this.WIDSet;
    }

    /**
     * Set 设备wid,非必填
     * @param WIDSet 设备wid,非必填
     */
    public void setWIDSet(String [] WIDSet) {
        this.WIDSet = WIDSet;
    }

    /**
     * Get 自定义字段 
     * @return Field 自定义字段
     */
    public CustomField getField() {
        return this.Field;
    }

    /**
     * Set 自定义字段
     * @param Field 自定义字段
     */
    public void setField(CustomField Field) {
        this.Field = Field;
    }

    /**
     * Get 分组id列表，非必填 
     * @return GroupIdSet 分组id列表，非必填
     */
    public Long [] getGroupIdSet() {
        return this.GroupIdSet;
    }

    /**
     * Set 分组id列表，非必填
     * @param GroupIdSet 分组id列表，非必填
     */
    public void setGroupIdSet(Long [] GroupIdSet) {
        this.GroupIdSet = GroupIdSet;
    }

    /**
     * Get 是否激活，默认全部，"1"激活，"0"未激活 
     * @return IsActive 是否激活，默认全部，"1"激活，"0"未激活
     */
    public String getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 是否激活，默认全部，"1"激活，"0"未激活
     * @param IsActive 是否激活，默认全部，"1"激活，"0"未激活
     */
    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get 是否为摄像头，默认全部，"true"摄像头，"false"非摄像头 
     * @return IsCamera 是否为摄像头，默认全部，"true"摄像头，"false"非摄像头
     */
    public String getIsCamera() {
        return this.IsCamera;
    }

    /**
     * Set 是否为摄像头，默认全部，"true"摄像头，"false"非摄像头
     * @param IsCamera 是否为摄像头，默认全部，"true"摄像头，"false"非摄像头
     */
    public void setIsCamera(String IsCamera) {
        this.IsCamera = IsCamera;
    }

    public DescribeDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceListRequest(DescribeDeviceListRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.DeviceTypeSet != null) {
            this.DeviceTypeSet = new String[source.DeviceTypeSet.length];
            for (int i = 0; i < source.DeviceTypeSet.length; i++) {
                this.DeviceTypeSet[i] = new String(source.DeviceTypeSet[i]);
            }
        }
        if (source.ProductIdSet != null) {
            this.ProductIdSet = new Long[source.ProductIdSet.length];
            for (int i = 0; i < source.ProductIdSet.length; i++) {
                this.ProductIdSet[i] = new Long(source.ProductIdSet[i]);
            }
        }
        if (source.TagIdSet != null) {
            this.TagIdSet = new Long[source.TagIdSet.length];
            for (int i = 0; i < source.TagIdSet.length; i++) {
                this.TagIdSet[i] = new Long(source.TagIdSet[i]);
            }
        }
        if (source.SpaceCodeSet != null) {
            this.SpaceCodeSet = new String[source.SpaceCodeSet.length];
            for (int i = 0; i < source.SpaceCodeSet.length; i++) {
                this.SpaceCodeSet[i] = new String(source.SpaceCodeSet[i]);
            }
        }
        if (source.DeviceTagSet != null) {
            this.DeviceTagSet = new String[source.DeviceTagSet.length];
            for (int i = 0; i < source.DeviceTagSet.length; i++) {
                this.DeviceTagSet[i] = new String(source.DeviceTagSet[i]);
            }
        }
        if (source.WIDSet != null) {
            this.WIDSet = new String[source.WIDSet.length];
            for (int i = 0; i < source.WIDSet.length; i++) {
                this.WIDSet[i] = new String(source.WIDSet[i]);
            }
        }
        if (source.Field != null) {
            this.Field = new CustomField(source.Field);
        }
        if (source.GroupIdSet != null) {
            this.GroupIdSet = new Long[source.GroupIdSet.length];
            for (int i = 0; i < source.GroupIdSet.length; i++) {
                this.GroupIdSet[i] = new Long(source.GroupIdSet[i]);
            }
        }
        if (source.IsActive != null) {
            this.IsActive = new String(source.IsActive);
        }
        if (source.IsCamera != null) {
            this.IsCamera = new String(source.IsCamera);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamArraySimple(map, prefix + "DeviceTypeSet.", this.DeviceTypeSet);
        this.setParamArraySimple(map, prefix + "ProductIdSet.", this.ProductIdSet);
        this.setParamArraySimple(map, prefix + "TagIdSet.", this.TagIdSet);
        this.setParamArraySimple(map, prefix + "SpaceCodeSet.", this.SpaceCodeSet);
        this.setParamArraySimple(map, prefix + "DeviceTagSet.", this.DeviceTagSet);
        this.setParamArraySimple(map, prefix + "WIDSet.", this.WIDSet);
        this.setParamObj(map, prefix + "Field.", this.Field);
        this.setParamArraySimple(map, prefix + "GroupIdSet.", this.GroupIdSet);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "IsCamera", this.IsCamera);

    }
}

