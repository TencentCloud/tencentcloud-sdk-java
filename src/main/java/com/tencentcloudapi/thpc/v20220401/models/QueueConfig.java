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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueConfig extends AbstractModel {

    /**
    * <p>队列名称。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>队列中弹性节点数量最小值。取值范围0～200。</p>
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * <p>队列中弹性节点数量最大值。取值范围0～200。</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>是否开启自动扩容。</p>
    */
    @SerializedName("EnableAutoExpansion")
    @Expose
    private Boolean EnableAutoExpansion;

    /**
    * <p>是否开启自动缩容。</p>
    */
    @SerializedName("EnableAutoShrink")
    @Expose
    private Boolean EnableAutoShrink;

    /**
    * <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>扩容节点配置信息。</p>
    */
    @SerializedName("ExpansionNodeConfigs")
    @Expose
    private ExpansionNodeConfig [] ExpansionNodeConfigs;

    /**
    * <p>扩容实例模板，可以在cvm侧进行设置</p>
    */
    @SerializedName("LaunchTemplateIds")
    @Expose
    private String [] LaunchTemplateIds;

    /**
     * Get <p>队列名称。</p> 
     * @return QueueName <p>队列名称。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称。</p>
     * @param QueueName <p>队列名称。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>队列中弹性节点数量最小值。取值范围0～200。</p> 
     * @return MinSize <p>队列中弹性节点数量最小值。取值范围0～200。</p>
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set <p>队列中弹性节点数量最小值。取值范围0～200。</p>
     * @param MinSize <p>队列中弹性节点数量最小值。取值范围0～200。</p>
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get <p>队列中弹性节点数量最大值。取值范围0～200。</p> 
     * @return MaxSize <p>队列中弹性节点数量最大值。取值范围0～200。</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>队列中弹性节点数量最大值。取值范围0～200。</p>
     * @param MaxSize <p>队列中弹性节点数量最大值。取值范围0～200。</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>是否开启自动扩容。</p> 
     * @return EnableAutoExpansion <p>是否开启自动扩容。</p>
     */
    public Boolean getEnableAutoExpansion() {
        return this.EnableAutoExpansion;
    }

    /**
     * Set <p>是否开启自动扩容。</p>
     * @param EnableAutoExpansion <p>是否开启自动扩容。</p>
     */
    public void setEnableAutoExpansion(Boolean EnableAutoExpansion) {
        this.EnableAutoExpansion = EnableAutoExpansion;
    }

    /**
     * Get <p>是否开启自动缩容。</p> 
     * @return EnableAutoShrink <p>是否开启自动缩容。</p>
     */
    public Boolean getEnableAutoShrink() {
        return this.EnableAutoShrink;
    }

    /**
     * Set <p>是否开启自动缩容。</p>
     * @param EnableAutoShrink <p>是否开启自动缩容。</p>
     */
    public void setEnableAutoShrink(Boolean EnableAutoShrink) {
        this.EnableAutoShrink = EnableAutoShrink;
    }

    /**
     * Get <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p> 
     * @return ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
     * @param ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p> 
     * @return SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     * @param SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p> 
     * @return DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     * @param DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     * @param InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>扩容节点配置信息。</p> 
     * @return ExpansionNodeConfigs <p>扩容节点配置信息。</p>
     */
    public ExpansionNodeConfig [] getExpansionNodeConfigs() {
        return this.ExpansionNodeConfigs;
    }

    /**
     * Set <p>扩容节点配置信息。</p>
     * @param ExpansionNodeConfigs <p>扩容节点配置信息。</p>
     */
    public void setExpansionNodeConfigs(ExpansionNodeConfig [] ExpansionNodeConfigs) {
        this.ExpansionNodeConfigs = ExpansionNodeConfigs;
    }

    /**
     * Get <p>扩容实例模板，可以在cvm侧进行设置</p> 
     * @return LaunchTemplateIds <p>扩容实例模板，可以在cvm侧进行设置</p>
     */
    public String [] getLaunchTemplateIds() {
        return this.LaunchTemplateIds;
    }

    /**
     * Set <p>扩容实例模板，可以在cvm侧进行设置</p>
     * @param LaunchTemplateIds <p>扩容实例模板，可以在cvm侧进行设置</p>
     */
    public void setLaunchTemplateIds(String [] LaunchTemplateIds) {
        this.LaunchTemplateIds = LaunchTemplateIds;
    }

    public QueueConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueConfig(QueueConfig source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.EnableAutoExpansion != null) {
            this.EnableAutoExpansion = new Boolean(source.EnableAutoExpansion);
        }
        if (source.EnableAutoShrink != null) {
            this.EnableAutoShrink = new Boolean(source.EnableAutoShrink);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.ExpansionNodeConfigs != null) {
            this.ExpansionNodeConfigs = new ExpansionNodeConfig[source.ExpansionNodeConfigs.length];
            for (int i = 0; i < source.ExpansionNodeConfigs.length; i++) {
                this.ExpansionNodeConfigs[i] = new ExpansionNodeConfig(source.ExpansionNodeConfigs[i]);
            }
        }
        if (source.LaunchTemplateIds != null) {
            this.LaunchTemplateIds = new String[source.LaunchTemplateIds.length];
            for (int i = 0; i < source.LaunchTemplateIds.length; i++) {
                this.LaunchTemplateIds[i] = new String(source.LaunchTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "EnableAutoExpansion", this.EnableAutoExpansion);
        this.setParamSimple(map, prefix + "EnableAutoShrink", this.EnableAutoShrink);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "ExpansionNodeConfigs.", this.ExpansionNodeConfigs);
        this.setParamArraySimple(map, prefix + "LaunchTemplateIds.", this.LaunchTemplateIds);

    }
}

