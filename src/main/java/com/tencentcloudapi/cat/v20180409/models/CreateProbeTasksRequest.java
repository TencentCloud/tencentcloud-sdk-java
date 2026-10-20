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

public class CreateProbeTasksRequest extends AbstractModel {

    /**
    * <p>批量任务名-地址</p>
    */
    @SerializedName("BatchTasks")
    @Expose
    private ProbeTaskBasicConfiguration [] BatchTasks;

    /**
    * <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>拨测节点，如10001，具体拨测地域运营商对应的拨测点编号可联系云拨测确认。</p>
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
    * <p>拨测间隔，单位为分钟</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>拨测参数，详细可参考云拨测官方文档,链接:https://cloud.tencent.com/document/product/248/87308#createprobetasks。</p>
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

    /**
    * <p>定时任务cron表达式</p>
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * <p>资源标签值</p>
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * <p>测试类型，包含定时测试与即时测试。0-定时拨测，其它表示即时拨测。</p>
    */
    @SerializedName("ProbeType")
    @Expose
    private Long ProbeType;

    /**
    * <p>插件类型，如CDN，详情参考云拨测官方文档。</p>
    */
    @SerializedName("PluginSource")
    @Expose
    private String PluginSource;

    /**
    * <p>客户端ID</p>
    */
    @SerializedName("ClientNum")
    @Expose
    private String ClientNum;

    /**
    * <p>拨测点IP类型：0-不限制IP类型，1-IPv4，2-IPv6</p>
    */
    @SerializedName("NodeIpType")
    @Expose
    private Long NodeIpType;

    /**
    * <p>供应商子账户同步标志</p>
    */
    @SerializedName("SubSyncFlag")
    @Expose
    private Long SubSyncFlag;

    /**
    * <p>创建者名称</p>
    */
    @SerializedName("RtxName")
    @Expose
    private String RtxName;

    /**
     * Get <p>批量任务名-地址</p> 
     * @return BatchTasks <p>批量任务名-地址</p>
     */
    public ProbeTaskBasicConfiguration [] getBatchTasks() {
        return this.BatchTasks;
    }

    /**
     * Set <p>批量任务名-地址</p>
     * @param BatchTasks <p>批量任务名-地址</p>
     */
    public void setBatchTasks(ProbeTaskBasicConfiguration [] BatchTasks) {
        this.BatchTasks = BatchTasks;
    }

    /**
     * Get <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois</p> 
     * @return TaskType <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois</p>
     * @param TaskType <p>任务类型，如1、2、3、4、5、6、7；1-页面性能、2-文件上传、3-文件下载、4-端口性能、5-网络质量、6-音视频体验、7-域名whois</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>拨测节点，如10001，具体拨测地域运营商对应的拨测点编号可联系云拨测确认。</p> 
     * @return Nodes <p>拨测节点，如10001，具体拨测地域运营商对应的拨测点编号可联系云拨测确认。</p>
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>拨测节点，如10001，具体拨测地域运营商对应的拨测点编号可联系云拨测确认。</p>
     * @param Nodes <p>拨测节点，如10001，具体拨测地域运营商对应的拨测点编号可联系云拨测确认。</p>
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>拨测间隔，单位为分钟</p> 
     * @return Interval <p>拨测间隔，单位为分钟</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>拨测间隔，单位为分钟</p>
     * @param Interval <p>拨测间隔，单位为分钟</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>拨测参数，详细可参考云拨测官方文档,链接:https://cloud.tencent.com/document/product/248/87308#createprobetasks。</p> 
     * @return Parameters <p>拨测参数，详细可参考云拨测官方文档,链接:https://cloud.tencent.com/document/product/248/87308#createprobetasks。</p>
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>拨测参数，详细可参考云拨测官方文档,链接:https://cloud.tencent.com/document/product/248/87308#createprobetasks。</p>
     * @param Parameters <p>拨测参数，详细可参考云拨测官方文档,链接:https://cloud.tencent.com/document/product/248/87308#createprobetasks。</p>
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li> 
     * @return TaskCategory <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
     * @param TaskCategory <p>任务分类</p><li>1 = PC</li><li> 2 = Mobile </li>
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    /**
     * Get <p>定时任务cron表达式</p> 
     * @return Cron <p>定时任务cron表达式</p>
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set <p>定时任务cron表达式</p>
     * @param Cron <p>定时任务cron表达式</p>
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get <p>资源标签值</p> 
     * @return Tag <p>资源标签值</p>
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>资源标签值</p>
     * @param Tag <p>资源标签值</p>
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
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

    /**
     * Get <p>插件类型，如CDN，详情参考云拨测官方文档。</p> 
     * @return PluginSource <p>插件类型，如CDN，详情参考云拨测官方文档。</p>
     */
    public String getPluginSource() {
        return this.PluginSource;
    }

    /**
     * Set <p>插件类型，如CDN，详情参考云拨测官方文档。</p>
     * @param PluginSource <p>插件类型，如CDN，详情参考云拨测官方文档。</p>
     */
    public void setPluginSource(String PluginSource) {
        this.PluginSource = PluginSource;
    }

    /**
     * Get <p>客户端ID</p> 
     * @return ClientNum <p>客户端ID</p>
     */
    public String getClientNum() {
        return this.ClientNum;
    }

    /**
     * Set <p>客户端ID</p>
     * @param ClientNum <p>客户端ID</p>
     */
    public void setClientNum(String ClientNum) {
        this.ClientNum = ClientNum;
    }

    /**
     * Get <p>拨测点IP类型：0-不限制IP类型，1-IPv4，2-IPv6</p> 
     * @return NodeIpType <p>拨测点IP类型：0-不限制IP类型，1-IPv4，2-IPv6</p>
     */
    public Long getNodeIpType() {
        return this.NodeIpType;
    }

    /**
     * Set <p>拨测点IP类型：0-不限制IP类型，1-IPv4，2-IPv6</p>
     * @param NodeIpType <p>拨测点IP类型：0-不限制IP类型，1-IPv4，2-IPv6</p>
     */
    public void setNodeIpType(Long NodeIpType) {
        this.NodeIpType = NodeIpType;
    }

    /**
     * Get <p>供应商子账户同步标志</p> 
     * @return SubSyncFlag <p>供应商子账户同步标志</p>
     */
    public Long getSubSyncFlag() {
        return this.SubSyncFlag;
    }

    /**
     * Set <p>供应商子账户同步标志</p>
     * @param SubSyncFlag <p>供应商子账户同步标志</p>
     */
    public void setSubSyncFlag(Long SubSyncFlag) {
        this.SubSyncFlag = SubSyncFlag;
    }

    /**
     * Get <p>创建者名称</p> 
     * @return RtxName <p>创建者名称</p>
     */
    public String getRtxName() {
        return this.RtxName;
    }

    /**
     * Set <p>创建者名称</p>
     * @param RtxName <p>创建者名称</p>
     */
    public void setRtxName(String RtxName) {
        this.RtxName = RtxName;
    }

    public CreateProbeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProbeTasksRequest(CreateProbeTasksRequest source) {
        if (source.BatchTasks != null) {
            this.BatchTasks = new ProbeTaskBasicConfiguration[source.BatchTasks.length];
            for (int i = 0; i < source.BatchTasks.length; i++) {
                this.BatchTasks[i] = new ProbeTaskBasicConfiguration(source.BatchTasks[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Nodes != null) {
            this.Nodes = new String[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new String(source.Nodes[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long(source.TaskCategory);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.ProbeType != null) {
            this.ProbeType = new Long(source.ProbeType);
        }
        if (source.PluginSource != null) {
            this.PluginSource = new String(source.PluginSource);
        }
        if (source.ClientNum != null) {
            this.ClientNum = new String(source.ClientNum);
        }
        if (source.NodeIpType != null) {
            this.NodeIpType = new Long(source.NodeIpType);
        }
        if (source.SubSyncFlag != null) {
            this.SubSyncFlag = new Long(source.SubSyncFlag);
        }
        if (source.RtxName != null) {
            this.RtxName = new String(source.RtxName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BatchTasks.", this.BatchTasks);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "TaskCategory", this.TaskCategory);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ProbeType", this.ProbeType);
        this.setParamSimple(map, prefix + "PluginSource", this.PluginSource);
        this.setParamSimple(map, prefix + "ClientNum", this.ClientNum);
        this.setParamSimple(map, prefix + "NodeIpType", this.NodeIpType);
        this.setParamSimple(map, prefix + "SubSyncFlag", this.SubSyncFlag);
        this.setParamSimple(map, prefix + "RtxName", this.RtxName);

    }
}

