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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgeCVMInstancesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
    */
    @SerializedName("RunInstancePara")
    @Expose
    private String RunInstancePara;

    /**
    * CVM所属Region
    */
    @SerializedName("CvmRegion")
    @Expose
    private String CvmRegion;

    /**
    * CVM数量
    */
    @SerializedName("CvmCount")
    @Expose
    private Long CvmCount;

    /**
    * 实例扩展信息
    */
    @SerializedName("External")
    @Expose
    private String External;

    /**
    * 用户自定义脚本
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * 是否开启弹性网卡功能
    */
    @SerializedName("EnableEni")
    @Expose
    private Boolean EnableEni;

    /**
     * Get 集群id 
     * @return ClusterID 集群id
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群id
     * @param ClusterID 集群id
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。 
     * @return RunInstancePara CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
     */
    public String getRunInstancePara() {
        return this.RunInstancePara;
    }

    /**
     * Set CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
     * @param RunInstancePara CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
     */
    public void setRunInstancePara(String RunInstancePara) {
        this.RunInstancePara = RunInstancePara;
    }

    /**
     * Get CVM所属Region 
     * @return CvmRegion CVM所属Region
     */
    public String getCvmRegion() {
        return this.CvmRegion;
    }

    /**
     * Set CVM所属Region
     * @param CvmRegion CVM所属Region
     */
    public void setCvmRegion(String CvmRegion) {
        this.CvmRegion = CvmRegion;
    }

    /**
     * Get CVM数量 
     * @return CvmCount CVM数量
     */
    public Long getCvmCount() {
        return this.CvmCount;
    }

    /**
     * Set CVM数量
     * @param CvmCount CVM数量
     */
    public void setCvmCount(Long CvmCount) {
        this.CvmCount = CvmCount;
    }

    /**
     * Get 实例扩展信息 
     * @return External 实例扩展信息
     */
    public String getExternal() {
        return this.External;
    }

    /**
     * Set 实例扩展信息
     * @param External 实例扩展信息
     */
    public void setExternal(String External) {
        this.External = External;
    }

    /**
     * Get 用户自定义脚本 
     * @return UserScript 用户自定义脚本
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set 用户自定义脚本
     * @param UserScript 用户自定义脚本
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get 是否开启弹性网卡功能 
     * @return EnableEni 是否开启弹性网卡功能
     */
    public Boolean getEnableEni() {
        return this.EnableEni;
    }

    /**
     * Set 是否开启弹性网卡功能
     * @param EnableEni 是否开启弹性网卡功能
     */
    public void setEnableEni(Boolean EnableEni) {
        this.EnableEni = EnableEni;
    }

    public CreateEdgeCVMInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeCVMInstancesRequest(CreateEdgeCVMInstancesRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.RunInstancePara != null) {
            this.RunInstancePara = new String(source.RunInstancePara);
        }
        if (source.CvmRegion != null) {
            this.CvmRegion = new String(source.CvmRegion);
        }
        if (source.CvmCount != null) {
            this.CvmCount = new Long(source.CvmCount);
        }
        if (source.External != null) {
            this.External = new String(source.External);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.EnableEni != null) {
            this.EnableEni = new Boolean(source.EnableEni);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "RunInstancePara", this.RunInstancePara);
        this.setParamSimple(map, prefix + "CvmRegion", this.CvmRegion);
        this.setParamSimple(map, prefix + "CvmCount", this.CvmCount);
        this.setParamSimple(map, prefix + "External", this.External);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamSimple(map, prefix + "EnableEni", this.EnableEni);

    }
}

