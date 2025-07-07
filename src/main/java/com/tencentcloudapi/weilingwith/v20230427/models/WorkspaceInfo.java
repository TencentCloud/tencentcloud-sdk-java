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

public class WorkspaceInfo extends AbstractModel {

    /**
    * 工作空间Id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 工作空间中文名字
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * 工作空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作空间是否删除状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 该工作空间绑定的区/县的行政区名字
    */
    @SerializedName("ParkName")
    @Expose
    private String ParkName;

    /**
    * 该工作空间绑定的区/县的行政区编码
    */
    @SerializedName("ParkNum")
    @Expose
    private String ParkNum;

    /**
    * 获取该工作空间绑定的区/县的上级行政区划信息
    */
    @SerializedName("AdministrativeDetailSet")
    @Expose
    private AdministrativeDetail [] AdministrativeDetailSet;

    /**
     * Get 工作空间Id 
     * @return WorkspaceId 工作空间Id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkspaceId 工作空间Id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 工作空间中文名字 
     * @return ChineseName 工作空间中文名字
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set 工作空间中文名字
     * @param ChineseName 工作空间中文名字
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get 工作空间描述 
     * @return Description 工作空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述
     * @param Description 工作空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作空间是否删除状态 
     * @return Status 工作空间是否删除状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 工作空间是否删除状态
     * @param Status 工作空间是否删除状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 该工作空间绑定的区/县的行政区名字 
     * @return ParkName 该工作空间绑定的区/县的行政区名字
     */
    public String getParkName() {
        return this.ParkName;
    }

    /**
     * Set 该工作空间绑定的区/县的行政区名字
     * @param ParkName 该工作空间绑定的区/县的行政区名字
     */
    public void setParkName(String ParkName) {
        this.ParkName = ParkName;
    }

    /**
     * Get 该工作空间绑定的区/县的行政区编码 
     * @return ParkNum 该工作空间绑定的区/县的行政区编码
     */
    public String getParkNum() {
        return this.ParkNum;
    }

    /**
     * Set 该工作空间绑定的区/县的行政区编码
     * @param ParkNum 该工作空间绑定的区/县的行政区编码
     */
    public void setParkNum(String ParkNum) {
        this.ParkNum = ParkNum;
    }

    /**
     * Get 获取该工作空间绑定的区/县的上级行政区划信息 
     * @return AdministrativeDetailSet 获取该工作空间绑定的区/县的上级行政区划信息
     */
    public AdministrativeDetail [] getAdministrativeDetailSet() {
        return this.AdministrativeDetailSet;
    }

    /**
     * Set 获取该工作空间绑定的区/县的上级行政区划信息
     * @param AdministrativeDetailSet 获取该工作空间绑定的区/县的上级行政区划信息
     */
    public void setAdministrativeDetailSet(AdministrativeDetail [] AdministrativeDetailSet) {
        this.AdministrativeDetailSet = AdministrativeDetailSet;
    }

    public WorkspaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceInfo(WorkspaceInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ParkName != null) {
            this.ParkName = new String(source.ParkName);
        }
        if (source.ParkNum != null) {
            this.ParkNum = new String(source.ParkNum);
        }
        if (source.AdministrativeDetailSet != null) {
            this.AdministrativeDetailSet = new AdministrativeDetail[source.AdministrativeDetailSet.length];
            for (int i = 0; i < source.AdministrativeDetailSet.length; i++) {
                this.AdministrativeDetailSet[i] = new AdministrativeDetail(source.AdministrativeDetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ParkName", this.ParkName);
        this.setParamSimple(map, prefix + "ParkNum", this.ParkNum);
        this.setParamArrayObj(map, prefix + "AdministrativeDetailSet.", this.AdministrativeDetailSet);

    }
}

