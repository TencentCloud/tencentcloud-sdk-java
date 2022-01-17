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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalService extends AbstractModel{

    /**
    * 共用组件类型，EMR/CUSTOM
    */
    @SerializedName("ShareType")
    @Expose
    private String ShareType;

    /**
    * 自定义参数集合
    */
    @SerializedName("CustomServiceDefineList")
    @Expose
    private CustomServiceDefine [] CustomServiceDefineList;

    /**
    * 共用组件名
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 共用组件集群
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 共用组件类型，EMR/CUSTOM 
     * @return ShareType 共用组件类型，EMR/CUSTOM
     */
    public String getShareType() {
        return this.ShareType;
    }

    /**
     * Set 共用组件类型，EMR/CUSTOM
     * @param ShareType 共用组件类型，EMR/CUSTOM
     */
    public void setShareType(String ShareType) {
        this.ShareType = ShareType;
    }

    /**
     * Get 自定义参数集合 
     * @return CustomServiceDefineList 自定义参数集合
     */
    public CustomServiceDefine [] getCustomServiceDefineList() {
        return this.CustomServiceDefineList;
    }

    /**
     * Set 自定义参数集合
     * @param CustomServiceDefineList 自定义参数集合
     */
    public void setCustomServiceDefineList(CustomServiceDefine [] CustomServiceDefineList) {
        this.CustomServiceDefineList = CustomServiceDefineList;
    }

    /**
     * Get 共用组件名 
     * @return Service 共用组件名
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 共用组件名
     * @param Service 共用组件名
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 共用组件集群 
     * @return InstanceId 共用组件集群
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 共用组件集群
     * @param InstanceId 共用组件集群
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ExternalService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalService(ExternalService source) {
        if (source.ShareType != null) {
            this.ShareType = new String(source.ShareType);
        }
        if (source.CustomServiceDefineList != null) {
            this.CustomServiceDefineList = new CustomServiceDefine[source.CustomServiceDefineList.length];
            for (int i = 0; i < source.CustomServiceDefineList.length; i++) {
                this.CustomServiceDefineList[i] = new CustomServiceDefine(source.CustomServiceDefineList[i]);
            }
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareType", this.ShareType);
        this.setParamArrayObj(map, prefix + "CustomServiceDefineList.", this.CustomServiceDefineList);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

