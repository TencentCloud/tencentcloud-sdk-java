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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenPostgRESTServiceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>是否开启外网</p>
    */
    @SerializedName("EnableWanNet")
    @Expose
    private Boolean EnableWanNet;

    /**
    * <p>PostgREST服务参数</p>
    */
    @SerializedName("RestConfig")
    @Expose
    private ParamEntry [] RestConfig;

    /**
    * <p>VPC</p><p>参数格式：私有网络ID，形如vpc-e6w23k31。非必选，不传默认使用实例的vpc</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如subnet-51lcif9y。非必选，不传则使用实例的子网</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get <p>实例ID</p> 
     * @return DBInstanceId <p>实例ID</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param DBInstanceId <p>实例ID</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>是否开启外网</p> 
     * @return EnableWanNet <p>是否开启外网</p>
     */
    public Boolean getEnableWanNet() {
        return this.EnableWanNet;
    }

    /**
     * Set <p>是否开启外网</p>
     * @param EnableWanNet <p>是否开启外网</p>
     */
    public void setEnableWanNet(Boolean EnableWanNet) {
        this.EnableWanNet = EnableWanNet;
    }

    /**
     * Get <p>PostgREST服务参数</p> 
     * @return RestConfig <p>PostgREST服务参数</p>
     */
    public ParamEntry [] getRestConfig() {
        return this.RestConfig;
    }

    /**
     * Set <p>PostgREST服务参数</p>
     * @param RestConfig <p>PostgREST服务参数</p>
     */
    public void setRestConfig(ParamEntry [] RestConfig) {
        this.RestConfig = RestConfig;
    }

    /**
     * Get <p>VPC</p><p>参数格式：私有网络ID，形如vpc-e6w23k31。非必选，不传默认使用实例的vpc</p> 
     * @return VpcId <p>VPC</p><p>参数格式：私有网络ID，形如vpc-e6w23k31。非必选，不传默认使用实例的vpc</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC</p><p>参数格式：私有网络ID，形如vpc-e6w23k31。非必选，不传默认使用实例的vpc</p>
     * @param VpcId <p>VPC</p><p>参数格式：私有网络ID，形如vpc-e6w23k31。非必选，不传默认使用实例的vpc</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如subnet-51lcif9y。非必选，不传则使用实例的子网</p> 
     * @return SubnetId <p>私有网络子网ID，形如subnet-51lcif9y。非必选，不传则使用实例的子网</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如subnet-51lcif9y。非必选，不传则使用实例的子网</p>
     * @param SubnetId <p>私有网络子网ID，形如subnet-51lcif9y。非必选，不传则使用实例的子网</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public OpenPostgRESTServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenPostgRESTServiceRequest(OpenPostgRESTServiceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.EnableWanNet != null) {
            this.EnableWanNet = new Boolean(source.EnableWanNet);
        }
        if (source.RestConfig != null) {
            this.RestConfig = new ParamEntry[source.RestConfig.length];
            for (int i = 0; i < source.RestConfig.length; i++) {
                this.RestConfig[i] = new ParamEntry(source.RestConfig[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "EnableWanNet", this.EnableWanNet);
        this.setParamArrayObj(map, prefix + "RestConfig.", this.RestConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

