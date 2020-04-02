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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeployGroupRequest extends AbstractModel{

    /**
    * 置放群组名称，最长不能超过60个字符。
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * 置放群组描述，最长不能超过200个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 置放群组的亲和性策略，目前仅支持取值为1，策略1表示同台物理机上限制实例的个数。
    */
    @SerializedName("Affinity")
    @Expose
    private Long [] Affinity;

    /**
    * 置放群组亲和性策略1中同台物理机上实例的限制个数。
    */
    @SerializedName("LimitNum")
    @Expose
    private Long LimitNum;

    /**
    * 置放群组机型属性，可选参数：SH12+SH02、TS85。
    */
    @SerializedName("DevClass")
    @Expose
    private String [] DevClass;

    /**
     * Get 置放群组名称，最长不能超过60个字符。 
     * @return DeployGroupName 置放群组名称，最长不能超过60个字符。
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set 置放群组名称，最长不能超过60个字符。
     * @param DeployGroupName 置放群组名称，最长不能超过60个字符。
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get 置放群组描述，最长不能超过200个字符。 
     * @return Description 置放群组描述，最长不能超过200个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 置放群组描述，最长不能超过200个字符。
     * @param Description 置放群组描述，最长不能超过200个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 置放群组的亲和性策略，目前仅支持取值为1，策略1表示同台物理机上限制实例的个数。 
     * @return Affinity 置放群组的亲和性策略，目前仅支持取值为1，策略1表示同台物理机上限制实例的个数。
     */
    public Long [] getAffinity() {
        return this.Affinity;
    }

    /**
     * Set 置放群组的亲和性策略，目前仅支持取值为1，策略1表示同台物理机上限制实例的个数。
     * @param Affinity 置放群组的亲和性策略，目前仅支持取值为1，策略1表示同台物理机上限制实例的个数。
     */
    public void setAffinity(Long [] Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get 置放群组亲和性策略1中同台物理机上实例的限制个数。 
     * @return LimitNum 置放群组亲和性策略1中同台物理机上实例的限制个数。
     */
    public Long getLimitNum() {
        return this.LimitNum;
    }

    /**
     * Set 置放群组亲和性策略1中同台物理机上实例的限制个数。
     * @param LimitNum 置放群组亲和性策略1中同台物理机上实例的限制个数。
     */
    public void setLimitNum(Long LimitNum) {
        this.LimitNum = LimitNum;
    }

    /**
     * Get 置放群组机型属性，可选参数：SH12+SH02、TS85。 
     * @return DevClass 置放群组机型属性，可选参数：SH12+SH02、TS85。
     */
    public String [] getDevClass() {
        return this.DevClass;
    }

    /**
     * Set 置放群组机型属性，可选参数：SH12+SH02、TS85。
     * @param DevClass 置放群组机型属性，可选参数：SH12+SH02、TS85。
     */
    public void setDevClass(String [] DevClass) {
        this.DevClass = DevClass;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Affinity.", this.Affinity);
        this.setParamSimple(map, prefix + "LimitNum", this.LimitNum);
        this.setParamArraySimple(map, prefix + "DevClass.", this.DevClass);

    }
}

