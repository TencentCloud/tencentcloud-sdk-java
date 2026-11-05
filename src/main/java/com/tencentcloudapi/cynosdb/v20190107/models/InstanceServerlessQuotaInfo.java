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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceServerlessQuotaInfo extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>最大CCU规格</p>
    */
    @SerializedName("MaxCcu")
    @Expose
    private Float MaxCcu;

    /**
    * <p>实例Serverless弹性开启状态</p><p>枚举值：</p><ul><li>opening： 开启中</li><li>opened： 已开启</li><li>closing： 关闭中</li><li>closed： 已关闭</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>开启Serverless弹性的时间</p>
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul> 
     * @return InstanceType <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     * @param InstanceType <p>实例类型</p><p>枚举值：</p><ul><li>rw： 读写</li><li>ro： 只读</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>最大CCU规格</p> 
     * @return MaxCcu <p>最大CCU规格</p>
     */
    public Float getMaxCcu() {
        return this.MaxCcu;
    }

    /**
     * Set <p>最大CCU规格</p>
     * @param MaxCcu <p>最大CCU规格</p>
     */
    public void setMaxCcu(Float MaxCcu) {
        this.MaxCcu = MaxCcu;
    }

    /**
     * Get <p>实例Serverless弹性开启状态</p><p>枚举值：</p><ul><li>opening： 开启中</li><li>opened： 已开启</li><li>closing： 关闭中</li><li>closed： 已关闭</li></ul> 
     * @return Status <p>实例Serverless弹性开启状态</p><p>枚举值：</p><ul><li>opening： 开启中</li><li>opened： 已开启</li><li>closing： 关闭中</li><li>closed： 已关闭</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例Serverless弹性开启状态</p><p>枚举值：</p><ul><li>opening： 开启中</li><li>opened： 已开启</li><li>closing： 关闭中</li><li>closed： 已关闭</li></ul>
     * @param Status <p>实例Serverless弹性开启状态</p><p>枚举值：</p><ul><li>opening： 开启中</li><li>opened： 已开启</li><li>closing： 关闭中</li><li>closed： 已关闭</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>开启Serverless弹性的时间</p> 
     * @return EnableTime <p>开启Serverless弹性的时间</p>
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set <p>开启Serverless弹性的时间</p>
     * @param EnableTime <p>开启Serverless弹性的时间</p>
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    public InstanceServerlessQuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceServerlessQuotaInfo(InstanceServerlessQuotaInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MaxCcu != null) {
            this.MaxCcu = new Float(source.MaxCcu);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MaxCcu", this.MaxCcu);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);

    }
}

