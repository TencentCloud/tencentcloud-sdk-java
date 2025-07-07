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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeDefineExt extends AbstractModel {

    /**
    * 节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 网络服务商
    */
    @SerializedName("NetService")
    @Expose
    private String NetService;

    /**
    * 区域
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * IP 类型
<li> 1 = IPv4 </li>
<li> 2 = IPv6 </li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * 区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 境外 </li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * 节点类型  如果为base 则为可用性拨测点，为空则为高级拨测点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeType")
    @Expose
    private String CodeType;

    /**
    * 节点支持的任务类型。1: 页面性能 2: 文件上传 3: 文件下载 4: 端口性能 5: 网络质量 6: 音视频体验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypes")
    @Expose
    private Long [] TaskTypes;

    /**
     * Get 节点名称 
     * @return Name 节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称
     * @param Name 节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点代码 
     * @return Code 节点代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 节点代码
     * @param Code 节点代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li> 
     * @return Type 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
     * @param Type 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 网络服务商 
     * @return NetService 网络服务商
     */
    public String getNetService() {
        return this.NetService;
    }

    /**
     * Set 网络服务商
     * @param NetService 网络服务商
     */
    public void setNetService(String NetService) {
        this.NetService = NetService;
    }

    /**
     * Get 区域 
     * @return District 区域
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 区域
     * @param District 区域
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get IP 类型
<li> 1 = IPv4 </li>
<li> 2 = IPv6 </li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPType IP 类型
<li> 1 = IPv4 </li>
<li> 2 = IPv6 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set IP 类型
<li> 1 = IPv4 </li>
<li> 2 = IPv6 </li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPType IP 类型
<li> 1 = IPv4 </li>
<li> 2 = IPv6 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
    }

    /**
     * Get 区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 境外 </li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 境外 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 境外 </li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 境外 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get 节点类型  如果为base 则为可用性拨测点，为空则为高级拨测点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeType 节点类型  如果为base 则为可用性拨测点，为空则为高级拨测点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 节点类型  如果为base 则为可用性拨测点，为空则为高级拨测点
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeType 节点类型  如果为base 则为可用性拨测点，为空则为高级拨测点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeType(String CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 节点支持的任务类型。1: 页面性能 2: 文件上传 3: 文件下载 4: 端口性能 5: 网络质量 6: 音视频体验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypes 节点支持的任务类型。1: 页面性能 2: 文件上传 3: 文件下载 4: 端口性能 5: 网络质量 6: 音视频体验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 节点支持的任务类型。1: 页面性能 2: 文件上传 3: 文件下载 4: 端口性能 5: 网络质量 6: 音视频体验
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypes 节点支持的任务类型。1: 页面性能 2: 文件上传 3: 文件下载 4: 端口性能 5: 网络质量 6: 音视频体验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypes(Long [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    public NodeDefineExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeDefineExt(NodeDefineExt source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NetService != null) {
            this.NetService = new String(source.NetService);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.IPType != null) {
            this.IPType = new Long(source.IPType);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
        if (source.CodeType != null) {
            this.CodeType = new String(source.CodeType);
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new Long[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new Long(source.TaskTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NetService", this.NetService);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "IPType", this.IPType);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

