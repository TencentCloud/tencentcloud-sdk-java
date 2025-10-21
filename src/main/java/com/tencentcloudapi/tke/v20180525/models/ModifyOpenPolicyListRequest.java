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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOpenPolicyListRequest extends AbstractModel {

    /**
    * 集群ID，请从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 修改的策略列表，目前仅支持修改EnforcementAction字段
    */
    @SerializedName("OpenPolicyInfoList")
    @Expose
    private OpenPolicySwitch [] OpenPolicyInfoList;

    /**
    * 策略分类 基线：baseline 优选：priority 可选：optional
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get 集群ID，请从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。 
     * @return ClusterId 集群ID，请从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，请从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
     * @param ClusterId 集群ID，请从容器服务集群控制台获取（https://console.cloud.tencent.com/tke2/cluster）。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 修改的策略列表，目前仅支持修改EnforcementAction字段 
     * @return OpenPolicyInfoList 修改的策略列表，目前仅支持修改EnforcementAction字段
     */
    public OpenPolicySwitch [] getOpenPolicyInfoList() {
        return this.OpenPolicyInfoList;
    }

    /**
     * Set 修改的策略列表，目前仅支持修改EnforcementAction字段
     * @param OpenPolicyInfoList 修改的策略列表，目前仅支持修改EnforcementAction字段
     */
    public void setOpenPolicyInfoList(OpenPolicySwitch [] OpenPolicyInfoList) {
        this.OpenPolicyInfoList = OpenPolicyInfoList;
    }

    /**
     * Get 策略分类 基线：baseline 优选：priority 可选：optional 
     * @return Category 策略分类 基线：baseline 优选：priority 可选：optional
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 策略分类 基线：baseline 优选：priority 可选：optional
     * @param Category 策略分类 基线：baseline 优选：priority 可选：optional
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public ModifyOpenPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOpenPolicyListRequest(ModifyOpenPolicyListRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OpenPolicyInfoList != null) {
            this.OpenPolicyInfoList = new OpenPolicySwitch[source.OpenPolicyInfoList.length];
            for (int i = 0; i < source.OpenPolicyInfoList.length; i++) {
                this.OpenPolicyInfoList[i] = new OpenPolicySwitch(source.OpenPolicyInfoList[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "OpenPolicyInfoList.", this.OpenPolicyInfoList);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

