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

public class DescribeNodeGroupsRequest extends AbstractModel {

    /**
    * <p>节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0</p>
    */
    @SerializedName("NodeType")
    @Expose
    private Long [] NodeType;

    /**
    * <p>节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。</p>
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

    /**
    * <p>IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0</p>
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * <p>拨测点描述关键词。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0</p>
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * <p>省份或国家ID。0表示全部，不填默认为0</p>
    */
    @SerializedName("DistrictID")
    @Expose
    private Long DistrictID;

    /**
    * <p>运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0</p>
    */
    @SerializedName("NetServiceID")
    @Expose
    private Long NetServiceID;

    /**
    * <p>节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0</p>
    */
    @SerializedName("NodeGroupType")
    @Expose
    private Long NodeGroupType;

    /**
    * <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。</p>
    */
    @SerializedName("ProbeType")
    @Expose
    private Long ProbeType;

    /**
     * Get <p>节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0</p> 
     * @return NodeType <p>节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0</p>
     */
    public Long [] getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0</p>
     * @param NodeType <p>节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0</p>
     */
    public void setNodeType(Long [] NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。</p> 
     * @return TaskCategory <p>节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。</p>
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set <p>节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。</p>
     * @param TaskCategory <p>节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。</p>
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get <p>IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0</p> 
     * @return IPType <p>IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0</p>
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set <p>IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0</p>
     * @param IPType <p>IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0</p>
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
    }

    /**
     * Get <p>拨测点描述关键词。</p> 
     * @return Name <p>拨测点描述关键词。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>拨测点描述关键词。</p>
     * @param Name <p>拨测点描述关键词。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0</p> 
     * @return RegionID <p>地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0</p>
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set <p>地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0</p>
     * @param RegionID <p>地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0</p>
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get <p>省份或国家ID。0表示全部，不填默认为0</p> 
     * @return DistrictID <p>省份或国家ID。0表示全部，不填默认为0</p>
     */
    public Long getDistrictID() {
        return this.DistrictID;
    }

    /**
     * Set <p>省份或国家ID。0表示全部，不填默认为0</p>
     * @param DistrictID <p>省份或国家ID。0表示全部，不填默认为0</p>
     */
    public void setDistrictID(Long DistrictID) {
        this.DistrictID = DistrictID;
    }

    /**
     * Get <p>运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0</p> 
     * @return NetServiceID <p>运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0</p>
     */
    public Long getNetServiceID() {
        return this.NetServiceID;
    }

    /**
     * Set <p>运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0</p>
     * @param NetServiceID <p>运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0</p>
     */
    public void setNetServiceID(Long NetServiceID) {
        this.NetServiceID = NetServiceID;
    }

    /**
     * Get <p>节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0</p> 
     * @return NodeGroupType <p>节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0</p>
     */
    public Long getNodeGroupType() {
        return this.NodeGroupType;
    }

    /**
     * Set <p>节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0</p>
     * @param NodeGroupType <p>节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0</p>
     */
    public void setNodeGroupType(Long NodeGroupType) {
        this.NodeGroupType = NodeGroupType;
    }

    /**
     * Get <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤</p> 
     * @return TaskType <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤</p>
     * @param TaskType <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。</p> 
     * @return ProbeType <p>测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。</p>
     */
    public Long getProbeType() {
        return this.ProbeType;
    }

    /**
     * Set <p>测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。</p>
     * @param ProbeType <p>测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。</p>
     */
    public void setProbeType(Long ProbeType) {
        this.ProbeType = ProbeType;
    }

    public DescribeNodeGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeGroupsRequest(DescribeNodeGroupsRequest source) {
        if (source.NodeType != null) {
            this.NodeType = new Long[source.NodeType.length];
            for (int i = 0; i < source.NodeType.length; i++) {
                this.NodeType[i] = new Long(source.NodeType[i]);
            }
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long(source.TaskCategory);
        }
        if (source.IPType != null) {
            this.IPType = new Long(source.IPType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.DistrictID != null) {
            this.DistrictID = new Long(source.DistrictID);
        }
        if (source.NetServiceID != null) {
            this.NetServiceID = new Long(source.NetServiceID);
        }
        if (source.NodeGroupType != null) {
            this.NodeGroupType = new Long(source.NodeGroupType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProbeType != null) {
            this.ProbeType = new Long(source.ProbeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NodeType.", this.NodeType);
        this.setParamSimple(map, prefix + "TaskCategory", this.TaskCategory);
        this.setParamSimple(map, prefix + "IPType", this.IPType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "DistrictID", this.DistrictID);
        this.setParamSimple(map, prefix + "NetServiceID", this.NetServiceID);
        this.setParamSimple(map, prefix + "NodeGroupType", this.NodeGroupType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProbeType", this.ProbeType);

    }
}

