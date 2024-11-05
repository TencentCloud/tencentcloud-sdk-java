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

public class ScanIpInfo extends AbstractModel {

    /**
    * 所属业务

    */
    @SerializedName("Bussiness")
    @Expose
    private String Bussiness;

    /**
    * 扫描对象
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * ip列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 扫描说明
    */
    @SerializedName("Descibe")
    @Expose
    private String Descibe;

    /**
    * 官方公告

    */
    @SerializedName("Referer")
    @Expose
    private String Referer;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 所属业务
 
     * @return Bussiness 所属业务

     */
    public String getBussiness() {
        return this.Bussiness;
    }

    /**
     * Set 所属业务

     * @param Bussiness 所属业务

     */
    public void setBussiness(String Bussiness) {
        this.Bussiness = Bussiness;
    }

    /**
     * Get 扫描对象 
     * @return Target 扫描对象
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 扫描对象
     * @param Target 扫描对象
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get ip列表 
     * @return IpList ip列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set ip列表
     * @param IpList ip列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 扫描说明 
     * @return Descibe 扫描说明
     */
    public String getDescibe() {
        return this.Descibe;
    }

    /**
     * Set 扫描说明
     * @param Descibe 扫描说明
     */
    public void setDescibe(String Descibe) {
        this.Descibe = Descibe;
    }

    /**
     * Get 官方公告
 
     * @return Referer 官方公告

     */
    public String getReferer() {
        return this.Referer;
    }

    /**
     * Set 官方公告

     * @param Referer 官方公告

     */
    public void setReferer(String Referer) {
        this.Referer = Referer;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ScanIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanIpInfo(ScanIpInfo source) {
        if (source.Bussiness != null) {
            this.Bussiness = new String(source.Bussiness);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.Descibe != null) {
            this.Descibe = new String(source.Descibe);
        }
        if (source.Referer != null) {
            this.Referer = new String(source.Referer);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bussiness", this.Bussiness);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Descibe", this.Descibe);
        this.setParamSimple(map, prefix + "Referer", this.Referer);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

