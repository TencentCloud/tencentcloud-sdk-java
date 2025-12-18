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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CnInstanceInfo extends AbstractModel {

    /**
    * ID值
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * cdwch-cn或者其他
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * cdwch-cn或者其他
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Running
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 运行中
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 无
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * -
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 无
    */
    @SerializedName("Resources")
    @Expose
    private CNResource [] Resources;

    /**
    * desc
    */
    @SerializedName("IsSecondaryZone")
    @Expose
    private String IsSecondaryZone;

    /**
    * desc
    */
    @SerializedName("SecondaryZoneInfo")
    @Expose
    private String SecondaryZoneInfo;

    /**
     * Get ID值 
     * @return ID ID值
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ID值
     * @param ID ID值
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get cdwch-cn或者其他 
     * @return InstanceType cdwch-cn或者其他
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set cdwch-cn或者其他
     * @param InstanceType cdwch-cn或者其他
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get cdwch-cn或者其他 
     * @return InstanceName cdwch-cn或者其他
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set cdwch-cn或者其他
     * @param InstanceName cdwch-cn或者其他
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Running 
     * @return Status Running
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Running
     * @param Status Running
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 运行中 
     * @return StatusDesc 运行中
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 运行中
     * @param StatusDesc 运行中
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 无 
     * @return InstanceStateInfo 无
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set 无
     * @param InstanceStateInfo 无
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get - 
     * @return InstanceID -
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set -
     * @param InstanceID -
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 无 
     * @return Resources 无
     */
    public CNResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set 无
     * @param Resources 无
     */
    public void setResources(CNResource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get desc 
     * @return IsSecondaryZone desc
     */
    public String getIsSecondaryZone() {
        return this.IsSecondaryZone;
    }

    /**
     * Set desc
     * @param IsSecondaryZone desc
     */
    public void setIsSecondaryZone(String IsSecondaryZone) {
        this.IsSecondaryZone = IsSecondaryZone;
    }

    /**
     * Get desc 
     * @return SecondaryZoneInfo desc
     */
    public String getSecondaryZoneInfo() {
        return this.SecondaryZoneInfo;
    }

    /**
     * Set desc
     * @param SecondaryZoneInfo desc
     */
    public void setSecondaryZoneInfo(String SecondaryZoneInfo) {
        this.SecondaryZoneInfo = SecondaryZoneInfo;
    }

    public CnInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CnInstanceInfo(CnInstanceInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.InstanceStateInfo != null) {
            this.InstanceStateInfo = new InstanceStateInfo(source.InstanceStateInfo);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Resources != null) {
            this.Resources = new CNResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new CNResource(source.Resources[i]);
            }
        }
        if (source.IsSecondaryZone != null) {
            this.IsSecondaryZone = new String(source.IsSecondaryZone);
        }
        if (source.SecondaryZoneInfo != null) {
            this.SecondaryZoneInfo = new String(source.SecondaryZoneInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamObj(map, prefix + "InstanceStateInfo.", this.InstanceStateInfo);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "IsSecondaryZone", this.IsSecondaryZone);
        this.setParamSimple(map, prefix + "SecondaryZoneInfo", this.SecondaryZoneInfo);

    }
}

