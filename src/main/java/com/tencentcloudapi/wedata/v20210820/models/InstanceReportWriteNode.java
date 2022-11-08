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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceReportWriteNode extends AbstractModel{

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 数据来源
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * 总条数
    */
    @SerializedName("TotalWriteRecords")
    @Expose
    private Long TotalWriteRecords;

    /**
    * 总字节数
    */
    @SerializedName("TotalWriteBytes")
    @Expose
    private Long TotalWriteBytes;

    /**
    * 速度（条/秒）
    */
    @SerializedName("RecordSpeed")
    @Expose
    private Long RecordSpeed;

    /**
    * 吞吐（Byte/秒）
    */
    @SerializedName("ByteSpeed")
    @Expose
    private Float ByteSpeed;

    /**
    * 脏数据条数
    */
    @SerializedName("TotalErrorRecords")
    @Expose
    private Long TotalErrorRecords;

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 数据来源 
     * @return DataSource 数据来源
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源
     * @param DataSource 数据来源
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 总条数 
     * @return TotalWriteRecords 总条数
     */
    public Long getTotalWriteRecords() {
        return this.TotalWriteRecords;
    }

    /**
     * Set 总条数
     * @param TotalWriteRecords 总条数
     */
    public void setTotalWriteRecords(Long TotalWriteRecords) {
        this.TotalWriteRecords = TotalWriteRecords;
    }

    /**
     * Get 总字节数 
     * @return TotalWriteBytes 总字节数
     */
    public Long getTotalWriteBytes() {
        return this.TotalWriteBytes;
    }

    /**
     * Set 总字节数
     * @param TotalWriteBytes 总字节数
     */
    public void setTotalWriteBytes(Long TotalWriteBytes) {
        this.TotalWriteBytes = TotalWriteBytes;
    }

    /**
     * Get 速度（条/秒） 
     * @return RecordSpeed 速度（条/秒）
     */
    public Long getRecordSpeed() {
        return this.RecordSpeed;
    }

    /**
     * Set 速度（条/秒）
     * @param RecordSpeed 速度（条/秒）
     */
    public void setRecordSpeed(Long RecordSpeed) {
        this.RecordSpeed = RecordSpeed;
    }

    /**
     * Get 吞吐（Byte/秒） 
     * @return ByteSpeed 吞吐（Byte/秒）
     */
    public Float getByteSpeed() {
        return this.ByteSpeed;
    }

    /**
     * Set 吞吐（Byte/秒）
     * @param ByteSpeed 吞吐（Byte/秒）
     */
    public void setByteSpeed(Float ByteSpeed) {
        this.ByteSpeed = ByteSpeed;
    }

    /**
     * Get 脏数据条数 
     * @return TotalErrorRecords 脏数据条数
     */
    public Long getTotalErrorRecords() {
        return this.TotalErrorRecords;
    }

    /**
     * Set 脏数据条数
     * @param TotalErrorRecords 脏数据条数
     */
    public void setTotalErrorRecords(Long TotalErrorRecords) {
        this.TotalErrorRecords = TotalErrorRecords;
    }

    public InstanceReportWriteNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceReportWriteNode(InstanceReportWriteNode source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.TotalWriteRecords != null) {
            this.TotalWriteRecords = new Long(source.TotalWriteRecords);
        }
        if (source.TotalWriteBytes != null) {
            this.TotalWriteBytes = new Long(source.TotalWriteBytes);
        }
        if (source.RecordSpeed != null) {
            this.RecordSpeed = new Long(source.RecordSpeed);
        }
        if (source.ByteSpeed != null) {
            this.ByteSpeed = new Float(source.ByteSpeed);
        }
        if (source.TotalErrorRecords != null) {
            this.TotalErrorRecords = new Long(source.TotalErrorRecords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "TotalWriteRecords", this.TotalWriteRecords);
        this.setParamSimple(map, prefix + "TotalWriteBytes", this.TotalWriteBytes);
        this.setParamSimple(map, prefix + "RecordSpeed", this.RecordSpeed);
        this.setParamSimple(map, prefix + "ByteSpeed", this.ByteSpeed);
        this.setParamSimple(map, prefix + "TotalErrorRecords", this.TotalErrorRecords);

    }
}

