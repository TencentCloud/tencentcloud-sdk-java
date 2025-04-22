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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeGroupsRequest extends AbstractModel {

    /**
    * 节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0
    */
    @SerializedName("NodeType")
    @Expose
    private Long [] NodeType;

    /**
    * 节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

    /**
    * IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * 拨测点描述关键词。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * 省份或国家ID。0表示全部，不填默认为0
    */
    @SerializedName("DistrictID")
    @Expose
    private Long DistrictID;

    /**
    * 运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0
    */
    @SerializedName("NetServiceID")
    @Expose
    private Long NetServiceID;

    /**
    * 节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0
    */
    @SerializedName("NodeGroupType")
    @Expose
    private Long NodeGroupType;

    /**
    * 任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。
    */
    @SerializedName("ProbeType")
    @Expose
    private Long ProbeType;

    /**
     * Get 节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0 
     * @return NodeType 节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0
     */
    public Long [] getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0
     * @param NodeType 节点类型。0: 全部 1: IDC 2: LastMile 3: Mobile，不填默认为0
     */
    public void setNodeType(Long [] NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。 
     * @return TaskCategory 节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set 节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。
     * @param TaskCategory 节点分类。0: 全部 1: PC 2：Mobile，不填默认为0。PC分类包括IDC和LM节点类型，Mobile分类包括Mobile节点类型。与NodeType参数取交集。
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0 
     * @return IPType IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0
     * @param IPType IP类型。0: 全部 1: IPv4 2: IPv6，不填默认为0
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
    }

    /**
     * Get 拨测点描述关键词。 
     * @return Name 拨测点描述关键词。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 拨测点描述关键词。
     * @param Name 拨测点描述关键词。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0 
     * @return RegionID 地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set 地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0
     * @param RegionID 地域ID。0: 精选拨测点 1: 国内 2: 港澳台 3: 亚太 4: 欧洲与美洲 5: 非洲与大洋洲，不填默认为0
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get 省份或国家ID。0表示全部，不填默认为0 
     * @return DistrictID 省份或国家ID。0表示全部，不填默认为0
     */
    public Long getDistrictID() {
        return this.DistrictID;
    }

    /**
     * Set 省份或国家ID。0表示全部，不填默认为0
     * @param DistrictID 省份或国家ID。0表示全部，不填默认为0
     */
    public void setDistrictID(Long DistrictID) {
        this.DistrictID = DistrictID;
    }

    /**
     * Get 运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0 
     * @return NetServiceID 运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0
     */
    public Long getNetServiceID() {
        return this.NetServiceID;
    }

    /**
     * Set 运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0
     * @param NetServiceID 运营商ID。0: 全部 1: 中国电信 2: 中国联通 3: 中国移动 99: 其他，不填默认为0
     */
    public void setNetServiceID(Long NetServiceID) {
        this.NetServiceID = NetServiceID;
    }

    /**
     * Get 节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0 
     * @return NodeGroupType 节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0
     */
    public Long getNodeGroupType() {
        return this.NodeGroupType;
    }

    /**
     * Set 节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0
     * @param NodeGroupType 节点组类型。0: 高级拨测点组 1: 可用性节点 2: 我的拨测点组，不填默认为0
     */
    public void setNodeGroupType(Long NodeGroupType) {
        this.NodeGroupType = NodeGroupType;
    }

    /**
     * Get 任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤 
     * @return TaskType 任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤
     * @param TaskType 任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois，不填默认为0，不对任务类型做过滤
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。 
     * @return ProbeType 测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。
     */
    public Long getProbeType() {
        return this.ProbeType;
    }

    /**
     * Set 测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。
     * @param ProbeType 测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。
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

