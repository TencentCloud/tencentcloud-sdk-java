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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel {

    /**
    * 镜像名称。
最多支持60个字符。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像描述。
最多支持 256 个字符。
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 是否执行强制关机以制作镜像。
取值范围：<br><li>true：表示关机之后制作镜像</li><br><li>false：表示开机状态制作镜像</li><br><br>默认取值：false。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
    * 创建Windows镜像时是否启用Sysprep。
取值范围：true或false，传true表示启用Sysprep，传false表示不启用，默认取值为false。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * 基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。
DataDiskIds 只能在指定 InstanceId 实例所包含的数据盘范围内指定。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的 `DataDisks` 获取。
    */
    @SerializedName("DataDiskIds")
    @Expose
    private String [] DataDiskIds;

    /**
    * 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与 InstanceId 同时传入。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeSnapshots](https://cloud.tencent.com/document/product/362/15647) 接口返回值中的`SnapshotId`获取。
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * 检测本次请求的是否成功，但不会对操作的资源产生任何影响。默认取值为false。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
可通过 [DescribeTags](https://cloud.tencent.com/document/api/651/35316) 接口返回值中的 `TagKey` 和 `TagValue` 获取。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 镜像族
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
     * Get 镜像名称。
最多支持60个字符。 
     * @return ImageName 镜像名称。
最多支持60个字符。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称。
最多支持60个字符。
     * @param ImageName 镜像名称。
最多支持60个字符。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。 
     * @return InstanceId 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
     * @param InstanceId 需要制作镜像的实例ID。基于实例创建镜像时，为必填参数。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像描述。
最多支持 256 个字符。 
     * @return ImageDescription 镜像描述。
最多支持 256 个字符。
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述。
最多支持 256 个字符。
     * @param ImageDescription 镜像描述。
最多支持 256 个字符。
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 是否执行强制关机以制作镜像。
取值范围：<br><li>true：表示关机之后制作镜像</li><br><li>false：表示开机状态制作镜像</li><br><br>默认取值：false。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。 
     * @return ForcePoweroff 是否执行强制关机以制作镜像。
取值范围：<br><li>true：表示关机之后制作镜像</li><br><li>false：表示开机状态制作镜像</li><br><br>默认取值：false。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * Set 是否执行强制关机以制作镜像。
取值范围：<br><li>true：表示关机之后制作镜像</li><br><li>false：表示开机状态制作镜像</li><br><br>默认取值：false。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
     * @param ForcePoweroff 是否执行强制关机以制作镜像。
取值范围：<br><li>true：表示关机之后制作镜像</li><br><li>false：表示开机状态制作镜像</li><br><br>默认取值：false。<br><br>开机状态制作镜像，可能导致部分数据未备份，影响数据安全。
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    /**
     * Get 创建Windows镜像时是否启用Sysprep。
取值范围：true或false，传true表示启用Sysprep，传false表示不启用，默认取值为false。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。 
     * @return Sysprep 创建Windows镜像时是否启用Sysprep。
取值范围：true或false，传true表示启用Sysprep，传false表示不启用，默认取值为false。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * Set 创建Windows镜像时是否启用Sysprep。
取值范围：true或false，传true表示启用Sysprep，传false表示不启用，默认取值为false。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
     * @param Sysprep 创建Windows镜像时是否启用Sysprep。
取值范围：true或false，传true表示启用Sysprep，传false表示不启用，默认取值为false。

关于Sysprep的详情请参考[链接](https://cloud.tencent.com/document/product/213/43498)。
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * Get 基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。
DataDiskIds 只能在指定 InstanceId 实例所包含的数据盘范围内指定。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的 `DataDisks` 获取。 
     * @return DataDiskIds 基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。
DataDiskIds 只能在指定 InstanceId 实例所包含的数据盘范围内指定。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的 `DataDisks` 获取。
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * Set 基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。
DataDiskIds 只能在指定 InstanceId 实例所包含的数据盘范围内指定。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的 `DataDisks` 获取。
     * @param DataDiskIds 基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。
DataDiskIds 只能在指定 InstanceId 实例所包含的数据盘范围内指定。
可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的 `DataDisks` 获取。
     */
    public void setDataDiskIds(String [] DataDiskIds) {
        this.DataDiskIds = DataDiskIds;
    }

    /**
     * Get 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与 InstanceId 同时传入。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeSnapshots](https://cloud.tencent.com/document/product/362/15647) 接口返回值中的`SnapshotId`获取。 
     * @return SnapshotIds 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与 InstanceId 同时传入。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeSnapshots](https://cloud.tencent.com/document/product/362/15647) 接口返回值中的`SnapshotId`获取。
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与 InstanceId 同时传入。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeSnapshots](https://cloud.tencent.com/document/product/362/15647) 接口返回值中的`SnapshotId`获取。
     * @param SnapshotIds 基于快照创建镜像，指定快照ID，必须包含一个系统盘快照。不可与 InstanceId 同时传入。
InstanceId 和 SnapshotIds 为二选一必填参数。
可通过 [DescribeSnapshots](https://cloud.tencent.com/document/product/362/15647) 接口返回值中的`SnapshotId`获取。
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get 检测本次请求的是否成功，但不会对操作的资源产生任何影响。默认取值为false。 
     * @return DryRun 检测本次请求的是否成功，但不会对操作的资源产生任何影响。默认取值为false。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 检测本次请求的是否成功，但不会对操作的资源产生任何影响。默认取值为false。
     * @param DryRun 检测本次请求的是否成功，但不会对操作的资源产生任何影响。默认取值为false。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
可通过 [DescribeTags](https://cloud.tencent.com/document/api/651/35316) 接口返回值中的 `TagKey` 和 `TagValue` 获取。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
可通过 [DescribeTags](https://cloud.tencent.com/document/api/651/35316) 接口返回值中的 `TagKey` 和 `TagValue` 获取。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
可通过 [DescribeTags](https://cloud.tencent.com/document/api/651/35316) 接口返回值中的 `TagKey` 和 `TagValue` 获取。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到自定义镜像。
可通过 [DescribeTags](https://cloud.tencent.com/document/api/651/35316) 接口返回值中的 `TagKey` 和 `TagValue` 获取。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 镜像族 
     * @return ImageFamily 镜像族
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set 镜像族
     * @param ImageFamily 镜像族
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
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
        if (source.ImageFamily != null) {
            this.ImageFamily = new String(source.ImageFamily);
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
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);

    }
}

