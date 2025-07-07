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

public class DescribeDeviceStatusStatRequest extends AbstractModel {

    /**
    * 所属空间地理层级，必填。0表示查询所有层级（1、2）的设备状态，1表示楼栋，2表示楼层
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

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
    * 空间位置，非必填。为空表示查询所有（1，2）层级
    */
    @SerializedName("SpaceCodeSet")
    @Expose
    private String [] SpaceCodeSet;

    /**
    * 设备类型，非必填。为空表示查询所有设备类型
    */
    @SerializedName("DeviceTypeSet")
    @Expose
    private String [] DeviceTypeSet;

    /**
     * Get 所属空间地理层级，必填。0表示查询所有层级（1、2）的设备状态，1表示楼栋，2表示楼层 
     * @return Level 所属空间地理层级，必填。0表示查询所有层级（1、2）的设备状态，1表示楼栋，2表示楼层
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 所属空间地理层级，必填。0表示查询所有层级（1、2）的设备状态，1表示楼栋，2表示楼层
     * @param Level 所属空间地理层级，必填。0表示查询所有层级（1、2）的设备状态，1表示楼栋，2表示楼层
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

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
     * Get 空间位置，非必填。为空表示查询所有（1，2）层级 
     * @return SpaceCodeSet 空间位置，非必填。为空表示查询所有（1，2）层级
     */
    public String [] getSpaceCodeSet() {
        return this.SpaceCodeSet;
    }

    /**
     * Set 空间位置，非必填。为空表示查询所有（1，2）层级
     * @param SpaceCodeSet 空间位置，非必填。为空表示查询所有（1，2）层级
     */
    public void setSpaceCodeSet(String [] SpaceCodeSet) {
        this.SpaceCodeSet = SpaceCodeSet;
    }

    /**
     * Get 设备类型，非必填。为空表示查询所有设备类型 
     * @return DeviceTypeSet 设备类型，非必填。为空表示查询所有设备类型
     */
    public String [] getDeviceTypeSet() {
        return this.DeviceTypeSet;
    }

    /**
     * Set 设备类型，非必填。为空表示查询所有设备类型
     * @param DeviceTypeSet 设备类型，非必填。为空表示查询所有设备类型
     */
    public void setDeviceTypeSet(String [] DeviceTypeSet) {
        this.DeviceTypeSet = DeviceTypeSet;
    }

    public DescribeDeviceStatusStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceStatusStatRequest(DescribeDeviceStatusStatRequest source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.SpaceCodeSet != null) {
            this.SpaceCodeSet = new String[source.SpaceCodeSet.length];
            for (int i = 0; i < source.SpaceCodeSet.length; i++) {
                this.SpaceCodeSet[i] = new String(source.SpaceCodeSet[i]);
            }
        }
        if (source.DeviceTypeSet != null) {
            this.DeviceTypeSet = new String[source.DeviceTypeSet.length];
            for (int i = 0; i < source.DeviceTypeSet.length; i++) {
                this.DeviceTypeSet[i] = new String(source.DeviceTypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamArraySimple(map, prefix + "SpaceCodeSet.", this.SpaceCodeSet);
        this.setParamArraySimple(map, prefix + "DeviceTypeSet.", this.DeviceTypeSet);

    }
}

