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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel{

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 是否执行强制关机以制作镜像。
取值范围：<br><li>TRUE：表示关机之后制作镜像<br><li>FALSE：表示开机状态制作镜像<br><br>默认取值：FALSE。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
    * 创建Windows镜像时是否启用Sysprep。
取值范围：TRUE或FALSE，默认取值为FALSE。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * 基于实例创建整机镜像时，指定包含在镜像里的数据盘Id
    */
    @SerializedName("DataDiskIds")
    @Expose
    private String [] DataDiskIds;

    /**
    * 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与InstanceId同时传入。
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * 检测本次请求的是否成功，但不会对操作的资源产生任何影响
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。 
     * @return InstanceId 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
     * @param InstanceId 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像描述 
     * @return ImageDescription 镜像描述
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述
     * @param ImageDescription 镜像描述
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 是否执行强制关机以制作镜像。
取值范围：<br><li>TRUE：表示关机之后制作镜像<br><li>FALSE：表示开机状态制作镜像<br><br>默认取值：FALSE。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。 
     * @return ForcePoweroff 是否执行强制关机以制作镜像。
取值范围：<br><li>TRUE：表示关机之后制作镜像<br><li>FALSE：表示开机状态制作镜像<br><br>默认取值：FALSE。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * Set 是否执行强制关机以制作镜像。
取值范围：<br><li>TRUE：表示关机之后制作镜像<br><li>FALSE：表示开机状态制作镜像<br><br>默认取值：FALSE。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
     * @param ForcePoweroff 是否执行强制关机以制作镜像。
取值范围：<br><li>TRUE：表示关机之后制作镜像<br><li>FALSE：表示开机状态制作镜像<br><br>默认取值：FALSE。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    /**
     * Get 创建Windows镜像时是否启用Sysprep。
取值范围：TRUE或FALSE，默认取值为FALSE。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。 
     * @return Sysprep 创建Windows镜像时是否启用Sysprep。
取值范围：TRUE或FALSE，默认取值为FALSE。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * Set 创建Windows镜像时是否启用Sysprep。
取值范围：TRUE或FALSE，默认取值为FALSE。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
     * @param Sysprep 创建Windows镜像时是否启用Sysprep。
取值范围：TRUE或FALSE，默认取值为FALSE。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * Get 基于实例创建整机镜像时，指定包含在镜像里的数据盘Id 
     * @return DataDiskIds 基于实例创建整机镜像时，指定包含在镜像里的数据盘Id
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * Set 基于实例创建整机镜像时，指定包含在镜像里的数据盘Id
     * @param DataDiskIds 基于实例创建整机镜像时，指定包含在镜像里的数据盘Id
     */
    public void setDataDiskIds(String [] DataDiskIds) {
        this.DataDiskIds = DataDiskIds;
    }

    /**
     * Get 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与InstanceId同时传入。 
     * @return SnapshotIds 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与InstanceId同时传入。
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与InstanceId同时传入。
     * @param SnapshotIds 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与InstanceId同时传入。
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get 检测本次请求的是否成功，但不会对操作的资源产生任何影响 
     * @return DryRun 检测本次请求的是否成功，但不会对操作的资源产生任何影响
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 检测本次请求的是否成功，但不会对操作的资源产生任何影响
     * @param DryRun 检测本次请求的是否成功，但不会对操作的资源产生任何影响
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRequest(CreateImageRequest source) {
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ForcePoweroff != null) {
            this.ForcePoweroff = new String(source.ForcePoweroff);
        }
        if (source.Sysprep != null) {
            this.Sysprep = new String(source.Sysprep);
        }
        if (source.DataDiskIds != null) {
            this.DataDiskIds = new String[source.DataDiskIds.length];
            for (int i = 0; i < source.DataDiskIds.length; i++) {
                this.DataDiskIds[i] = new String(source.DataDiskIds[i]);
            }
        }
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);
        this.setParamSimple(map, prefix + "Sysprep", this.Sysprep);
        this.setParamArraySimple(map, prefix + "DataDiskIds.", this.DataDiskIds);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

