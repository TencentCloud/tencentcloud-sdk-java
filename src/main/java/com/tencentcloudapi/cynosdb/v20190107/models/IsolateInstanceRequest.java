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

public class IsolateInstanceRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例ID数组，例如[&quot;cynosdbbmysql-ins-asd&quot;,&quot;cynosdbmysql-ins-zxc&quot;]</p>
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * <p>该参数已废弃</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>实例退还原因类型</p>
    */
    @SerializedName("IsolateReasonTypes")
    @Expose
    private Long [] IsolateReasonTypes;

    /**
    * <p>实例退还原因补充</p>
    */
    @SerializedName("IsolateReason")
    @Expose
    private String IsolateReason;

    /**
    * <p>保留备份</p>
    */
    @SerializedName("SaveBackup")
    @Expose
    private Boolean SaveBackup;

    /**
    * <p>立即彻底删除RO实例</p>
    */
    @SerializedName("ImmediateRecycleRo")
    @Expose
    private Boolean ImmediateRecycleRo;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例ID数组，例如[&quot;cynosdbbmysql-ins-asd&quot;,&quot;cynosdbmysql-ins-zxc&quot;]</p> 
     * @return InstanceIdList <p>实例ID数组，例如[&quot;cynosdbbmysql-ins-asd&quot;,&quot;cynosdbmysql-ins-zxc&quot;]</p>
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set <p>实例ID数组，例如[&quot;cynosdbbmysql-ins-asd&quot;,&quot;cynosdbmysql-ins-zxc&quot;]</p>
     * @param InstanceIdList <p>实例ID数组，例如[&quot;cynosdbbmysql-ins-asd&quot;,&quot;cynosdbmysql-ins-zxc&quot;]</p>
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get <p>该参数已废弃</p> 
     * @return DbType <p>该参数已废弃</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>该参数已废弃</p>
     * @param DbType <p>该参数已废弃</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>实例退还原因类型</p> 
     * @return IsolateReasonTypes <p>实例退还原因类型</p>
     */
    public Long [] getIsolateReasonTypes() {
        return this.IsolateReasonTypes;
    }

    /**
     * Set <p>实例退还原因类型</p>
     * @param IsolateReasonTypes <p>实例退还原因类型</p>
     */
    public void setIsolateReasonTypes(Long [] IsolateReasonTypes) {
        this.IsolateReasonTypes = IsolateReasonTypes;
    }

    /**
     * Get <p>实例退还原因补充</p> 
     * @return IsolateReason <p>实例退还原因补充</p>
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set <p>实例退还原因补充</p>
     * @param IsolateReason <p>实例退还原因补充</p>
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    /**
     * Get <p>保留备份</p> 
     * @return SaveBackup <p>保留备份</p>
     */
    public Boolean getSaveBackup() {
        return this.SaveBackup;
    }

    /**
     * Set <p>保留备份</p>
     * @param SaveBackup <p>保留备份</p>
     */
    public void setSaveBackup(Boolean SaveBackup) {
        this.SaveBackup = SaveBackup;
    }

    /**
     * Get <p>立即彻底删除RO实例</p> 
     * @return ImmediateRecycleRo <p>立即彻底删除RO实例</p>
     */
    public Boolean getImmediateRecycleRo() {
        return this.ImmediateRecycleRo;
    }

    /**
     * Set <p>立即彻底删除RO实例</p>
     * @param ImmediateRecycleRo <p>立即彻底删除RO实例</p>
     */
    public void setImmediateRecycleRo(Boolean ImmediateRecycleRo) {
        this.ImmediateRecycleRo = ImmediateRecycleRo;
    }

    public IsolateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateInstanceRequest(IsolateInstanceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.IsolateReasonTypes != null) {
            this.IsolateReasonTypes = new Long[source.IsolateReasonTypes.length];
            for (int i = 0; i < source.IsolateReasonTypes.length; i++) {
                this.IsolateReasonTypes[i] = new Long(source.IsolateReasonTypes[i]);
            }
        }
        if (source.IsolateReason != null) {
            this.IsolateReason = new String(source.IsolateReason);
        }
        if (source.SaveBackup != null) {
            this.SaveBackup = new Boolean(source.SaveBackup);
        }
        if (source.ImmediateRecycleRo != null) {
            this.ImmediateRecycleRo = new Boolean(source.ImmediateRecycleRo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "IsolateReasonTypes.", this.IsolateReasonTypes);
        this.setParamSimple(map, prefix + "IsolateReason", this.IsolateReason);
        this.setParamSimple(map, prefix + "SaveBackup", this.SaveBackup);
        this.setParamSimple(map, prefix + "ImmediateRecycleRo", this.ImmediateRecycleRo);

    }
}

