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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBCustomNodeTypeInfo extends AbstractModel {

    /**
    * <p>可用区标识，如 ap-guangzhou-6</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>机型标识</p><p>枚举值：</p><ul><li>DB.SA5.2XLARGE32： DB.SA5机型</li><li>DB.AT5.8XLARGE128： DB.AT5机型</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>机型系列，如 DB.AT5、DB.SA5</p>
    */
    @SerializedName("NodeFamily")
    @Expose
    private String NodeFamily;

    /**
    * <p>CPU 核数</p><p>单位：核</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>内存大小</p><p>单位：GiB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>机型售卖状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>该机型允许的系统盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
    */
    @SerializedName("SystemDiskTypes")
    @Expose
    private String [] SystemDiskTypes;

    /**
    * <p>该机型允许的数据盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
    */
    @SerializedName("DataDiskTypes")
    @Expose
    private String [] DataDiskTypes;

    /**
     * Get <p>可用区标识，如 ap-guangzhou-6</p> 
     * @return Zone <p>可用区标识，如 ap-guangzhou-6</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区标识，如 ap-guangzhou-6</p>
     * @param Zone <p>可用区标识，如 ap-guangzhou-6</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>机型标识</p><p>枚举值：</p><ul><li>DB.SA5.2XLARGE32： DB.SA5机型</li><li>DB.AT5.8XLARGE128： DB.AT5机型</li></ul> 
     * @return NodeType <p>机型标识</p><p>枚举值：</p><ul><li>DB.SA5.2XLARGE32： DB.SA5机型</li><li>DB.AT5.8XLARGE128： DB.AT5机型</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>机型标识</p><p>枚举值：</p><ul><li>DB.SA5.2XLARGE32： DB.SA5机型</li><li>DB.AT5.8XLARGE128： DB.AT5机型</li></ul>
     * @param NodeType <p>机型标识</p><p>枚举值：</p><ul><li>DB.SA5.2XLARGE32： DB.SA5机型</li><li>DB.AT5.8XLARGE128： DB.AT5机型</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>机型系列，如 DB.AT5、DB.SA5</p> 
     * @return NodeFamily <p>机型系列，如 DB.AT5、DB.SA5</p>
     */
    public String getNodeFamily() {
        return this.NodeFamily;
    }

    /**
     * Set <p>机型系列，如 DB.AT5、DB.SA5</p>
     * @param NodeFamily <p>机型系列，如 DB.AT5、DB.SA5</p>
     */
    public void setNodeFamily(String NodeFamily) {
        this.NodeFamily = NodeFamily;
    }

    /**
     * Get <p>CPU 核数</p><p>单位：核</p> 
     * @return CPU <p>CPU 核数</p><p>单位：核</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU 核数</p><p>单位：核</p>
     * @param CPU <p>CPU 核数</p><p>单位：核</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>内存大小</p><p>单位：GiB</p> 
     * @return Memory <p>内存大小</p><p>单位：GiB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小</p><p>单位：GiB</p>
     * @param Memory <p>内存大小</p><p>单位：GiB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>机型售卖状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul> 
     * @return Status <p>机型售卖状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>机型售卖状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
     * @param Status <p>机型售卖状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>该机型允许的系统盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p> 
     * @return SystemDiskTypes <p>该机型允许的系统盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
     */
    public String [] getSystemDiskTypes() {
        return this.SystemDiskTypes;
    }

    /**
     * Set <p>该机型允许的系统盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
     * @param SystemDiskTypes <p>该机型允许的系统盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
     */
    public void setSystemDiskTypes(String [] SystemDiskTypes) {
        this.SystemDiskTypes = SystemDiskTypes;
    }

    /**
     * Get <p>该机型允许的数据盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p> 
     * @return DataDiskTypes <p>该机型允许的数据盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
     */
    public String [] getDataDiskTypes() {
        return this.DataDiskTypes;
    }

    /**
     * Set <p>该机型允许的数据盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
     * @param DataDiskTypes <p>该机型允许的数据盘类型列表（如 CLOUD_BSSD、CLOUD_HSSD）；</p>
     */
    public void setDataDiskTypes(String [] DataDiskTypes) {
        this.DataDiskTypes = DataDiskTypes;
    }

    public DBCustomNodeTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBCustomNodeTypeInfo(DBCustomNodeTypeInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeFamily != null) {
            this.NodeFamily = new String(source.NodeFamily);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SystemDiskTypes != null) {
            this.SystemDiskTypes = new String[source.SystemDiskTypes.length];
            for (int i = 0; i < source.SystemDiskTypes.length; i++) {
                this.SystemDiskTypes[i] = new String(source.SystemDiskTypes[i]);
            }
        }
        if (source.DataDiskTypes != null) {
            this.DataDiskTypes = new String[source.DataDiskTypes.length];
            for (int i = 0; i < source.DataDiskTypes.length; i++) {
                this.DataDiskTypes[i] = new String(source.DataDiskTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeFamily", this.NodeFamily);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SystemDiskTypes.", this.SystemDiskTypes);
        this.setParamArraySimple(map, prefix + "DataDiskTypes.", this.DataDiskTypes);

    }
}

