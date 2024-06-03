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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApiSecEventChangeRequest extends AbstractModel {

    /**
    * 变更状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 处理人
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 备注，有长度显示1k
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 批量操作的事件列表
    */
    @SerializedName("EventIdList")
    @Expose
    private String [] EventIdList;

    /**
    * 批量操作的api列表
    */
    @SerializedName("ApiNameList")
    @Expose
    private ApiSecKey [] ApiNameList;

    /**
    * 判断是否删除，包括删除事件和删除资产
    */
    @SerializedName("IsDelete")
    @Expose
    private Boolean IsDelete;

    /**
    * 判断是否是更新api的备注，更新api备注的时候，为true
    */
    @SerializedName("UpdateApiRemark")
    @Expose
    private Boolean UpdateApiRemark;

    /**
     * Get 变更状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略 
     * @return Mode 变更状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 变更状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     * @param Mode 变更状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 处理人 
     * @return UserName 处理人
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 处理人
     * @param UserName 处理人
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 备注，有长度显示1k 
     * @return Remark 备注，有长度显示1k
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，有长度显示1k
     * @param Remark 备注，有长度显示1k
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 批量操作的事件列表 
     * @return EventIdList 批量操作的事件列表
     */
    public String [] getEventIdList() {
        return this.EventIdList;
    }

    /**
     * Set 批量操作的事件列表
     * @param EventIdList 批量操作的事件列表
     */
    public void setEventIdList(String [] EventIdList) {
        this.EventIdList = EventIdList;
    }

    /**
     * Get 批量操作的api列表 
     * @return ApiNameList 批量操作的api列表
     */
    public ApiSecKey [] getApiNameList() {
        return this.ApiNameList;
    }

    /**
     * Set 批量操作的api列表
     * @param ApiNameList 批量操作的api列表
     */
    public void setApiNameList(ApiSecKey [] ApiNameList) {
        this.ApiNameList = ApiNameList;
    }

    /**
     * Get 判断是否删除，包括删除事件和删除资产 
     * @return IsDelete 判断是否删除，包括删除事件和删除资产
     */
    public Boolean getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set 判断是否删除，包括删除事件和删除资产
     * @param IsDelete 判断是否删除，包括删除事件和删除资产
     */
    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    /**
     * Get 判断是否是更新api的备注，更新api备注的时候，为true 
     * @return UpdateApiRemark 判断是否是更新api的备注，更新api备注的时候，为true
     */
    public Boolean getUpdateApiRemark() {
        return this.UpdateApiRemark;
    }

    /**
     * Set 判断是否是更新api的备注，更新api备注的时候，为true
     * @param UpdateApiRemark 判断是否是更新api的备注，更新api备注的时候，为true
     */
    public void setUpdateApiRemark(Boolean UpdateApiRemark) {
        this.UpdateApiRemark = UpdateApiRemark;
    }

    public ModifyApiSecEventChangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiSecEventChangeRequest(ModifyApiSecEventChangeRequest source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EventIdList != null) {
            this.EventIdList = new String[source.EventIdList.length];
            for (int i = 0; i < source.EventIdList.length; i++) {
                this.EventIdList[i] = new String(source.EventIdList[i]);
            }
        }
        if (source.ApiNameList != null) {
            this.ApiNameList = new ApiSecKey[source.ApiNameList.length];
            for (int i = 0; i < source.ApiNameList.length; i++) {
                this.ApiNameList[i] = new ApiSecKey(source.ApiNameList[i]);
            }
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Boolean(source.IsDelete);
        }
        if (source.UpdateApiRemark != null) {
            this.UpdateApiRemark = new Boolean(source.UpdateApiRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "EventIdList.", this.EventIdList);
        this.setParamArrayObj(map, prefix + "ApiNameList.", this.ApiNameList);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);
        this.setParamSimple(map, prefix + "UpdateApiRemark", this.UpdateApiRemark);

    }
}

