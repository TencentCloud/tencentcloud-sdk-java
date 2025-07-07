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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiscoveryCondition extends AbstractModel {

    /**
    * RDB实例列表
    */
    @SerializedName("RDBInstances")
    @Expose
    private RDBInstance [] RDBInstances;

    /**
    * COS实例列表
    */
    @SerializedName("COSInstances")
    @Expose
    private COSInstance [] COSInstances;

    /**
    * Mongo实例列表
    */
    @SerializedName("NOSQLInstances")
    @Expose
    private NOSQLInstance [] NOSQLInstances;

    /**
    * ES实例列表
    */
    @SerializedName("ESInstances")
    @Expose
    private ESInstance [] ESInstances;

    /**
     * Get RDB实例列表 
     * @return RDBInstances RDB实例列表
     */
    public RDBInstance [] getRDBInstances() {
        return this.RDBInstances;
    }

    /**
     * Set RDB实例列表
     * @param RDBInstances RDB实例列表
     */
    public void setRDBInstances(RDBInstance [] RDBInstances) {
        this.RDBInstances = RDBInstances;
    }

    /**
     * Get COS实例列表 
     * @return COSInstances COS实例列表
     */
    public COSInstance [] getCOSInstances() {
        return this.COSInstances;
    }

    /**
     * Set COS实例列表
     * @param COSInstances COS实例列表
     */
    public void setCOSInstances(COSInstance [] COSInstances) {
        this.COSInstances = COSInstances;
    }

    /**
     * Get Mongo实例列表 
     * @return NOSQLInstances Mongo实例列表
     */
    public NOSQLInstance [] getNOSQLInstances() {
        return this.NOSQLInstances;
    }

    /**
     * Set Mongo实例列表
     * @param NOSQLInstances Mongo实例列表
     */
    public void setNOSQLInstances(NOSQLInstance [] NOSQLInstances) {
        this.NOSQLInstances = NOSQLInstances;
    }

    /**
     * Get ES实例列表 
     * @return ESInstances ES实例列表
     */
    public ESInstance [] getESInstances() {
        return this.ESInstances;
    }

    /**
     * Set ES实例列表
     * @param ESInstances ES实例列表
     */
    public void setESInstances(ESInstance [] ESInstances) {
        this.ESInstances = ESInstances;
    }

    public DiscoveryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiscoveryCondition(DiscoveryCondition source) {
        if (source.RDBInstances != null) {
            this.RDBInstances = new RDBInstance[source.RDBInstances.length];
            for (int i = 0; i < source.RDBInstances.length; i++) {
                this.RDBInstances[i] = new RDBInstance(source.RDBInstances[i]);
            }
        }
        if (source.COSInstances != null) {
            this.COSInstances = new COSInstance[source.COSInstances.length];
            for (int i = 0; i < source.COSInstances.length; i++) {
                this.COSInstances[i] = new COSInstance(source.COSInstances[i]);
            }
        }
        if (source.NOSQLInstances != null) {
            this.NOSQLInstances = new NOSQLInstance[source.NOSQLInstances.length];
            for (int i = 0; i < source.NOSQLInstances.length; i++) {
                this.NOSQLInstances[i] = new NOSQLInstance(source.NOSQLInstances[i]);
            }
        }
        if (source.ESInstances != null) {
            this.ESInstances = new ESInstance[source.ESInstances.length];
            for (int i = 0; i < source.ESInstances.length; i++) {
                this.ESInstances[i] = new ESInstance(source.ESInstances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RDBInstances.", this.RDBInstances);
        this.setParamArrayObj(map, prefix + "COSInstances.", this.COSInstances);
        this.setParamArrayObj(map, prefix + "NOSQLInstances.", this.NOSQLInstances);
        this.setParamArrayObj(map, prefix + "ESInstances.", this.ESInstances);

    }
}

