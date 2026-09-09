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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceParamsByExportConfsRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>导入配置项</p>
    */
    @SerializedName("ExportConfParamList")
    @Expose
    private ExportConfMeta [] ExportConfParamList;

    /**
    * <p>ip</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * <p>配置组</p>
    */
    @SerializedName("ConfGroupName")
    @Expose
    private String ConfGroupName;

    /**
     * Get <p>集群id</p> 
     * @return InstanceId <p>集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群id</p>
     * @param InstanceId <p>集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>导入配置项</p> 
     * @return ExportConfParamList <p>导入配置项</p>
     */
    public ExportConfMeta [] getExportConfParamList() {
        return this.ExportConfParamList;
    }

    /**
     * Set <p>导入配置项</p>
     * @param ExportConfParamList <p>导入配置项</p>
     */
    public void setExportConfParamList(ExportConfMeta [] ExportConfParamList) {
        this.ExportConfParamList = ExportConfParamList;
    }

    /**
     * Get <p>ip</p> 
     * @return IpList <p>ip</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>ip</p>
     * @param IpList <p>ip</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>配置组</p> 
     * @return ConfGroupName <p>配置组</p>
     */
    public String getConfGroupName() {
        return this.ConfGroupName;
    }

    /**
     * Set <p>配置组</p>
     * @param ConfGroupName <p>配置组</p>
     */
    public void setConfGroupName(String ConfGroupName) {
        this.ConfGroupName = ConfGroupName;
    }

    public ModifyServiceParamsByExportConfsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceParamsByExportConfsRequest(ModifyServiceParamsByExportConfsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExportConfParamList != null) {
            this.ExportConfParamList = new ExportConfMeta[source.ExportConfParamList.length];
            for (int i = 0; i < source.ExportConfParamList.length; i++) {
                this.ExportConfParamList[i] = new ExportConfMeta(source.ExportConfParamList[i]);
            }
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.ConfGroupName != null) {
            this.ConfGroupName = new String(source.ConfGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ExportConfParamList.", this.ExportConfParamList);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "ConfGroupName", this.ConfGroupName);

    }
}

