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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceStatusListRequest extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

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
    * 设备类型
    */
    @SerializedName("DeviceTypeSet")
    @Expose
    private String [] DeviceTypeSet;

    /**
    * 产品 pid
    */
    @SerializedName("ProductIdSet")
    @Expose
    private Long [] ProductIdSet;

    /**
    * 设备标签id

    */
    @SerializedName("TagIdSet")
    @Expose
    private Long [] TagIdSet;

    /**
    * 空间位置（支持空间多层，比如具体建筑、具体楼层）
    */
    @SerializedName("SpaceCodeSet")
    @Expose
    private String [] SpaceCodeSet;

    /**
    * 设备编号列表

    */
    @SerializedName("WIDSet")
    @Expose
    private String [] WIDSet;

    /**
    * 设备标签名，非必填
    */
    @SerializedName("DeviceTagSet")
    @Expose
    private String [] DeviceTagSet;

    /**
    * 通信在/离线状态（online=normal+fault、offline）
    */
    @SerializedName("DeviceStatusSet")
    @Expose
    private String [] DeviceStatusSet;

    /**
    * 设备业务状态
（正常-normal、故障-fault、离线-offline）

    */
    @SerializedName("StatusSet")
    @Expose
    private String [] StatusSet;

    /**
    * 推流状态，推流中-true，未推流-false 仅摄像头有的状态
    */
    @SerializedName("IsAlive")
    @Expose
    private Boolean [] IsAlive;

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
     * Get 设备类型 
     * @return DeviceTypeSet 设备类型
     */
    public String [] getDeviceTypeSet() {
        return this.DeviceTypeSet;
    }

    /**
     * Set 设备类型
     * @param DeviceTypeSet 设备类型
     */
    public void setDeviceTypeSet(String [] DeviceTypeSet) {
        this.DeviceTypeSet = DeviceTypeSet;
    }

    /**
     * Get 产品 pid 
     * @return ProductIdSet 产品 pid
     */
    public Long [] getProductIdSet() {
        return this.ProductIdSet;
    }

    /**
     * Set 产品 pid
     * @param ProductIdSet 产品 pid
     */
    public void setProductIdSet(Long [] ProductIdSet) {
        this.ProductIdSet = ProductIdSet;
    }

    /**
     * Get 设备标签id
 
     * @return TagIdSet 设备标签id

     */
    public Long [] getTagIdSet() {
        return this.TagIdSet;
    }

    /**
     * Set 设备标签id

     * @param TagIdSet 设备标签id

     */
    public void setTagIdSet(Long [] TagIdSet) {
        this.TagIdSet = TagIdSet;
    }

    /**
     * Get 空间位置（支持空间多层，比如具体建筑、具体楼层） 
     * @return SpaceCodeSet 空间位置（支持空间多层，比如具体建筑、具体楼层）
     */
    public String [] getSpaceCodeSet() {
        return this.SpaceCodeSet;
    }

    /**
     * Set 空间位置（支持空间多层，比如具体建筑、具体楼层）
     * @param SpaceCodeSet 空间位置（支持空间多层，比如具体建筑、具体楼层）
     */
    public void setSpaceCodeSet(String [] SpaceCodeSet) {
        this.SpaceCodeSet = SpaceCodeSet;
    }

    /**
     * Get 设备编号列表
 
     * @return WIDSet 设备编号列表

     */
    public String [] getWIDSet() {
        return this.WIDSet;
    }

    /**
     * Set 设备编号列表

     * @param WIDSet 设备编号列表

     */
    public void setWIDSet(String [] WIDSet) {
        this.WIDSet = WIDSet;
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
     * Get 通信在/离线状态（online=normal+fault、offline） 
     * @return DeviceStatusSet 通信在/离线状态（online=normal+fault、offline）
     */
    public String [] getDeviceStatusSet() {
        return this.DeviceStatusSet;
    }

    /**
     * Set 通信在/离线状态（online=normal+fault、offline）
     * @param DeviceStatusSet 通信在/离线状态（online=normal+fault、offline）
     */
    public void setDeviceStatusSet(String [] DeviceStatusSet) {
        this.DeviceStatusSet = DeviceStatusSet;
    }

    /**
     * Get 设备业务状态
（正常-normal、故障-fault、离线-offline）
 
     * @return StatusSet 设备业务状态
（正常-normal、故障-fault、离线-offline）

     */
    public String [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 设备业务状态
（正常-normal、故障-fault、离线-offline）

     * @param StatusSet 设备业务状态
（正常-normal、故障-fault、离线-offline）

     */
    public void setStatusSet(String [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 推流状态，推流中-true，未推流-false 仅摄像头有的状态 
     * @return IsAlive 推流状态，推流中-true，未推流-false 仅摄像头有的状态
     */
    public Boolean [] getIsAlive() {
        return this.IsAlive;
    }

    /**
     * Set 推流状态，推流中-true，未推流-false 仅摄像头有的状态
     * @param IsAlive 推流状态，推流中-true，未推流-false 仅摄像头有的状态
     */
    public void setIsAlive(Boolean [] IsAlive) {
        this.IsAlive = IsAlive;
    }

    public DescribeDeviceStatusListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceStatusListRequest(DescribeDeviceStatusListRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        if (source.WIDSet != null) {
            this.WIDSet = new String[source.WIDSet.length];
            for (int i = 0; i < source.WIDSet.length; i++) {
                this.WIDSet[i] = new String(source.WIDSet[i]);
            }
        }
        if (source.DeviceTagSet != null) {
            this.DeviceTagSet = new String[source.DeviceTagSet.length];
            for (int i = 0; i < source.DeviceTagSet.length; i++) {
                this.DeviceTagSet[i] = new String(source.DeviceTagSet[i]);
            }
        }
        if (source.DeviceStatusSet != null) {
            this.DeviceStatusSet = new String[source.DeviceStatusSet.length];
            for (int i = 0; i < source.DeviceStatusSet.length; i++) {
                this.DeviceStatusSet[i] = new String(source.DeviceStatusSet[i]);
            }
        }
        if (source.StatusSet != null) {
            this.StatusSet = new String[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new String(source.StatusSet[i]);
            }
        }
        if (source.IsAlive != null) {
            this.IsAlive = new Boolean[source.IsAlive.length];
            for (int i = 0; i < source.IsAlive.length; i++) {
                this.IsAlive[i] = new Boolean(source.IsAlive[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "DeviceTypeSet.", this.DeviceTypeSet);
        this.setParamArraySimple(map, prefix + "ProductIdSet.", this.ProductIdSet);
        this.setParamArraySimple(map, prefix + "TagIdSet.", this.TagIdSet);
        this.setParamArraySimple(map, prefix + "SpaceCodeSet.", this.SpaceCodeSet);
        this.setParamArraySimple(map, prefix + "WIDSet.", this.WIDSet);
        this.setParamArraySimple(map, prefix + "DeviceTagSet.", this.DeviceTagSet);
        this.setParamArraySimple(map, prefix + "DeviceStatusSet.", this.DeviceStatusSet);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamArraySimple(map, prefix + "IsAlive.", this.IsAlive);

    }
}

