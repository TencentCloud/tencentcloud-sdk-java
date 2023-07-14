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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenAuditServiceRequest extends AbstractModel{

    /**
    * 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 与Product保持一致。如："dcdb" ,"mariadb"。
    */
    @SerializedName("NodeRequestType")
    @Expose
    private String NodeRequestType;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志保存总时长，只能是7,30,90,180,365,1095,1825。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 高频日志保存时长，只能是7,30,90,180,365,1095,1825。
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
     * Get 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。 
     * @return Product 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
     * @param Product 服务产品类型，支持值包括： "dcdb" - 云数据库 Tdsql， "mariadb" - 云数据库 MariaDB。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 与Product保持一致。如："dcdb" ,"mariadb"。 
     * @return NodeRequestType 与Product保持一致。如："dcdb" ,"mariadb"。
     */
    public String getNodeRequestType() {
        return this.NodeRequestType;
    }

    /**
     * Set 与Product保持一致。如："dcdb" ,"mariadb"。
     * @param NodeRequestType 与Product保持一致。如："dcdb" ,"mariadb"。
     */
    public void setNodeRequestType(String NodeRequestType) {
        this.NodeRequestType = NodeRequestType;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志保存总时长，只能是7,30,90,180,365,1095,1825。 
     * @return LogExpireDay 日志保存总时长，只能是7,30,90,180,365,1095,1825。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 日志保存总时长，只能是7,30,90,180,365,1095,1825。
     * @param LogExpireDay 日志保存总时长，只能是7,30,90,180,365,1095,1825。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 高频日志保存时长，只能是7,30,90,180,365,1095,1825。 
     * @return HotLogExpireDay 高频日志保存时长，只能是7,30,90,180,365,1095,1825。
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set 高频日志保存时长，只能是7,30,90,180,365,1095,1825。
     * @param HotLogExpireDay 高频日志保存时长，只能是7,30,90,180,365,1095,1825。
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    public OpenAuditServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenAuditServiceRequest(OpenAuditServiceRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.NodeRequestType != null) {
            this.NodeRequestType = new String(source.NodeRequestType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "NodeRequestType", this.NodeRequestType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);

    }
}

