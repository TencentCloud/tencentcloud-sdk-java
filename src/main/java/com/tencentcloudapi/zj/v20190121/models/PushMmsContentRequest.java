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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushMmsContentRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 素材样例id
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 手机号
    */
    @SerializedName("Tel")
    @Expose
    private String Tel;

    /**
    * 附带数据字段
    */
    @SerializedName("Session")
    @Expose
    private String Session;

    /**
    * 动态参数key(即申请样例时设置的u_或p_开头的动态参数,要求序号有序)
    */
    @SerializedName("DynamicParaKey")
    @Expose
    private String [] DynamicParaKey;

    /**
    * 动态参数值,和DynamicParaKey对应
    */
    @SerializedName("DynamicParaValue")
    @Expose
    private String [] DynamicParaValue;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 素材样例id 
     * @return InstanceId 素材样例id
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 素材样例id
     * @param InstanceId 素材样例id
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 手机号 
     * @return Tel 手机号
     */
    public String getTel() {
        return this.Tel;
    }

    /**
     * Set 手机号
     * @param Tel 手机号
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    /**
     * Get 附带数据字段 
     * @return Session 附带数据字段
     */
    public String getSession() {
        return this.Session;
    }

    /**
     * Set 附带数据字段
     * @param Session 附带数据字段
     */
    public void setSession(String Session) {
        this.Session = Session;
    }

    /**
     * Get 动态参数key(即申请样例时设置的u_或p_开头的动态参数,要求序号有序) 
     * @return DynamicParaKey 动态参数key(即申请样例时设置的u_或p_开头的动态参数,要求序号有序)
     */
    public String [] getDynamicParaKey() {
        return this.DynamicParaKey;
    }

    /**
     * Set 动态参数key(即申请样例时设置的u_或p_开头的动态参数,要求序号有序)
     * @param DynamicParaKey 动态参数key(即申请样例时设置的u_或p_开头的动态参数,要求序号有序)
     */
    public void setDynamicParaKey(String [] DynamicParaKey) {
        this.DynamicParaKey = DynamicParaKey;
    }

    /**
     * Get 动态参数值,和DynamicParaKey对应 
     * @return DynamicParaValue 动态参数值,和DynamicParaKey对应
     */
    public String [] getDynamicParaValue() {
        return this.DynamicParaValue;
    }

    /**
     * Set 动态参数值,和DynamicParaKey对应
     * @param DynamicParaValue 动态参数值,和DynamicParaKey对应
     */
    public void setDynamicParaValue(String [] DynamicParaValue) {
        this.DynamicParaValue = DynamicParaValue;
    }

    public PushMmsContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushMmsContentRequest(PushMmsContentRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.Tel != null) {
            this.Tel = new String(source.Tel);
        }
        if (source.Session != null) {
            this.Session = new String(source.Session);
        }
        if (source.DynamicParaKey != null) {
            this.DynamicParaKey = new String[source.DynamicParaKey.length];
            for (int i = 0; i < source.DynamicParaKey.length; i++) {
                this.DynamicParaKey[i] = new String(source.DynamicParaKey[i]);
            }
        }
        if (source.DynamicParaValue != null) {
            this.DynamicParaValue = new String[source.DynamicParaValue.length];
            for (int i = 0; i < source.DynamicParaValue.length; i++) {
                this.DynamicParaValue[i] = new String(source.DynamicParaValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Tel", this.Tel);
        this.setParamSimple(map, prefix + "Session", this.Session);
        this.setParamArraySimple(map, prefix + "DynamicParaKey.", this.DynamicParaKey);
        this.setParamArraySimple(map, prefix + "DynamicParaValue.", this.DynamicParaValue);

    }
}

