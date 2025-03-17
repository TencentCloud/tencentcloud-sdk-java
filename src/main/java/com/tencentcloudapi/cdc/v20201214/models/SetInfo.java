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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetInfo extends AbstractModel {

    /**
    * 云硬盘仓库id
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
    * 云硬盘仓库名称
    */
    @SerializedName("SetName")
    @Expose
    private String SetName;

    /**
    * 云硬盘仓库类型
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
    * 云硬盘仓库容量
    */
    @SerializedName("SetSize")
    @Expose
    private Float SetSize;

    /**
    * 云硬盘仓库状态
    */
    @SerializedName("SetStatus")
    @Expose
    private String SetStatus;

    /**
    * 云硬盘仓库创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 读流量
    */
    @SerializedName("ReadTraffic")
    @Expose
    private DetailData ReadTraffic;

    /**
    * 写流量
    */
    @SerializedName("WriteTraffic")
    @Expose
    private DetailData WriteTraffic;

    /**
    * 读IO
    */
    @SerializedName("ReadIO")
    @Expose
    private DetailData ReadIO;

    /**
    * 写IO
    */
    @SerializedName("WriteIO")
    @Expose
    private DetailData WriteIO;

    /**
    * 平均等待时间
    */
    @SerializedName("Await")
    @Expose
    private DetailData Await;

    /**
    * 利用率
    */
    @SerializedName("Util")
    @Expose
    private DetailData Util;

    /**
     * Get 云硬盘仓库id 
     * @return SetId 云硬盘仓库id
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set 云硬盘仓库id
     * @param SetId 云硬盘仓库id
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 云硬盘仓库名称 
     * @return SetName 云硬盘仓库名称
     */
    public String getSetName() {
        return this.SetName;
    }

    /**
     * Set 云硬盘仓库名称
     * @param SetName 云硬盘仓库名称
     */
    public void setSetName(String SetName) {
        this.SetName = SetName;
    }

    /**
     * Get 云硬盘仓库类型 
     * @return SetType 云硬盘仓库类型
     */
    public String getSetType() {
        return this.SetType;
    }

    /**
     * Set 云硬盘仓库类型
     * @param SetType 云硬盘仓库类型
     */
    public void setSetType(String SetType) {
        this.SetType = SetType;
    }

    /**
     * Get 云硬盘仓库容量 
     * @return SetSize 云硬盘仓库容量
     */
    public Float getSetSize() {
        return this.SetSize;
    }

    /**
     * Set 云硬盘仓库容量
     * @param SetSize 云硬盘仓库容量
     */
    public void setSetSize(Float SetSize) {
        this.SetSize = SetSize;
    }

    /**
     * Get 云硬盘仓库状态 
     * @return SetStatus 云硬盘仓库状态
     */
    public String getSetStatus() {
        return this.SetStatus;
    }

    /**
     * Set 云硬盘仓库状态
     * @param SetStatus 云硬盘仓库状态
     */
    public void setSetStatus(String SetStatus) {
        this.SetStatus = SetStatus;
    }

    /**
     * Get 云硬盘仓库创建时间 
     * @return CreateTime 云硬盘仓库创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 云硬盘仓库创建时间
     * @param CreateTime 云硬盘仓库创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 读流量 
     * @return ReadTraffic 读流量
     */
    public DetailData getReadTraffic() {
        return this.ReadTraffic;
    }

    /**
     * Set 读流量
     * @param ReadTraffic 读流量
     */
    public void setReadTraffic(DetailData ReadTraffic) {
        this.ReadTraffic = ReadTraffic;
    }

    /**
     * Get 写流量 
     * @return WriteTraffic 写流量
     */
    public DetailData getWriteTraffic() {
        return this.WriteTraffic;
    }

    /**
     * Set 写流量
     * @param WriteTraffic 写流量
     */
    public void setWriteTraffic(DetailData WriteTraffic) {
        this.WriteTraffic = WriteTraffic;
    }

    /**
     * Get 读IO 
     * @return ReadIO 读IO
     */
    public DetailData getReadIO() {
        return this.ReadIO;
    }

    /**
     * Set 读IO
     * @param ReadIO 读IO
     */
    public void setReadIO(DetailData ReadIO) {
        this.ReadIO = ReadIO;
    }

    /**
     * Get 写IO 
     * @return WriteIO 写IO
     */
    public DetailData getWriteIO() {
        return this.WriteIO;
    }

    /**
     * Set 写IO
     * @param WriteIO 写IO
     */
    public void setWriteIO(DetailData WriteIO) {
        this.WriteIO = WriteIO;
    }

    /**
     * Get 平均等待时间 
     * @return Await 平均等待时间
     */
    public DetailData getAwait() {
        return this.Await;
    }

    /**
     * Set 平均等待时间
     * @param Await 平均等待时间
     */
    public void setAwait(DetailData Await) {
        this.Await = Await;
    }

    /**
     * Get 利用率 
     * @return Util 利用率
     */
    public DetailData getUtil() {
        return this.Util;
    }

    /**
     * Set 利用率
     * @param Util 利用率
     */
    public void setUtil(DetailData Util) {
        this.Util = Util;
    }

    public SetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetInfo(SetInfo source) {
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
        }
        if (source.SetName != null) {
            this.SetName = new String(source.SetName);
        }
        if (source.SetType != null) {
            this.SetType = new String(source.SetType);
        }
        if (source.SetSize != null) {
            this.SetSize = new Float(source.SetSize);
        }
        if (source.SetStatus != null) {
            this.SetStatus = new String(source.SetStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ReadTraffic != null) {
            this.ReadTraffic = new DetailData(source.ReadTraffic);
        }
        if (source.WriteTraffic != null) {
            this.WriteTraffic = new DetailData(source.WriteTraffic);
        }
        if (source.ReadIO != null) {
            this.ReadIO = new DetailData(source.ReadIO);
        }
        if (source.WriteIO != null) {
            this.WriteIO = new DetailData(source.WriteIO);
        }
        if (source.Await != null) {
            this.Await = new DetailData(source.Await);
        }
        if (source.Util != null) {
            this.Util = new DetailData(source.Util);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "SetName", this.SetName);
        this.setParamSimple(map, prefix + "SetType", this.SetType);
        this.setParamSimple(map, prefix + "SetSize", this.SetSize);
        this.setParamSimple(map, prefix + "SetStatus", this.SetStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "ReadTraffic.", this.ReadTraffic);
        this.setParamObj(map, prefix + "WriteTraffic.", this.WriteTraffic);
        this.setParamObj(map, prefix + "ReadIO.", this.ReadIO);
        this.setParamObj(map, prefix + "WriteIO.", this.WriteIO);
        this.setParamObj(map, prefix + "Await.", this.Await);
        this.setParamObj(map, prefix + "Util.", this.Util);

    }
}

