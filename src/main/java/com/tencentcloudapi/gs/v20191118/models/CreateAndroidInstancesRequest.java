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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstancesRequest extends AbstractModel {

    /**
    * 安卓实例可用区。
ap-guangzhou-3：广州三区
ap-shenzhen-1：深圳一区
ap-xian-ec-1：西安一区
ap-hangzhou-ec-1：杭州一区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 安卓实例类型。
A1：单开
A2：双开
A3：三开
A4：四开
A5：五开
A6：六开
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 HostSerialNumbers 不为空时，该参数表示每个宿主机要创建的安卓实例数量；
当 HostSerialNumbers 为空时，该参数表示要创建安卓实例的总数量，最大值为 100。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 宿主机 ID 列表。可以指定宿主机 ID 进行创建；也可以不指定由系统自动分配宿主机。
    */
    @SerializedName("HostSerialNumbers")
    @Expose
    private String [] HostSerialNumbers;

    /**
    * 镜像 ID。如果不填，将使用默认的系统镜像
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 安卓实例标签列表
    */
    @SerializedName("Labels")
    @Expose
    private AndroidInstanceLabel [] Labels;

    /**
     * Get 安卓实例可用区。
ap-guangzhou-3：广州三区
ap-shenzhen-1：深圳一区
ap-xian-ec-1：西安一区
ap-hangzhou-ec-1：杭州一区 
     * @return Zone 安卓实例可用区。
ap-guangzhou-3：广州三区
ap-shenzhen-1：深圳一区
ap-xian-ec-1：西安一区
ap-hangzhou-ec-1：杭州一区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 安卓实例可用区。
ap-guangzhou-3：广州三区
ap-shenzhen-1：深圳一区
ap-xian-ec-1：西安一区
ap-hangzhou-ec-1：杭州一区
     * @param Zone 安卓实例可用区。
ap-guangzhou-3：广州三区
ap-shenzhen-1：深圳一区
ap-xian-ec-1：西安一区
ap-hangzhou-ec-1：杭州一区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 安卓实例类型。
A1：单开
A2：双开
A3：三开
A4：四开
A5：五开
A6：六开 
     * @return Type 安卓实例类型。
A1：单开
A2：双开
A3：三开
A4：四开
A5：五开
A6：六开
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 安卓实例类型。
A1：单开
A2：双开
A3：三开
A4：四开
A5：五开
A6：六开
     * @param Type 安卓实例类型。
A1：单开
A2：双开
A3：三开
A4：四开
A5：五开
A6：六开
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 HostSerialNumbers 不为空时，该参数表示每个宿主机要创建的安卓实例数量；
当 HostSerialNumbers 为空时，该参数表示要创建安卓实例的总数量，最大值为 100。 
     * @return Number 当 HostSerialNumbers 不为空时，该参数表示每个宿主机要创建的安卓实例数量；
当 HostSerialNumbers 为空时，该参数表示要创建安卓实例的总数量，最大值为 100。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 当 HostSerialNumbers 不为空时，该参数表示每个宿主机要创建的安卓实例数量；
当 HostSerialNumbers 为空时，该参数表示要创建安卓实例的总数量，最大值为 100。
     * @param Number 当 HostSerialNumbers 不为空时，该参数表示每个宿主机要创建的安卓实例数量；
当 HostSerialNumbers 为空时，该参数表示要创建安卓实例的总数量，最大值为 100。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 宿主机 ID 列表。可以指定宿主机 ID 进行创建；也可以不指定由系统自动分配宿主机。 
     * @return HostSerialNumbers 宿主机 ID 列表。可以指定宿主机 ID 进行创建；也可以不指定由系统自动分配宿主机。
     */
    public String [] getHostSerialNumbers() {
        return this.HostSerialNumbers;
    }

    /**
     * Set 宿主机 ID 列表。可以指定宿主机 ID 进行创建；也可以不指定由系统自动分配宿主机。
     * @param HostSerialNumbers 宿主机 ID 列表。可以指定宿主机 ID 进行创建；也可以不指定由系统自动分配宿主机。
     */
    public void setHostSerialNumbers(String [] HostSerialNumbers) {
        this.HostSerialNumbers = HostSerialNumbers;
    }

    /**
     * Get 镜像 ID。如果不填，将使用默认的系统镜像 
     * @return ImageId 镜像 ID。如果不填，将使用默认的系统镜像
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像 ID。如果不填，将使用默认的系统镜像
     * @param ImageId 镜像 ID。如果不填，将使用默认的系统镜像
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 安卓实例标签列表 
     * @return Labels 安卓实例标签列表
     */
    public AndroidInstanceLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 安卓实例标签列表
     * @param Labels 安卓实例标签列表
     */
    public void setLabels(AndroidInstanceLabel [] Labels) {
        this.Labels = Labels;
    }

    public CreateAndroidInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstancesRequest(CreateAndroidInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.HostSerialNumbers != null) {
            this.HostSerialNumbers = new String[source.HostSerialNumbers.length];
            for (int i = 0; i < source.HostSerialNumbers.length; i++) {
                this.HostSerialNumbers[i] = new String(source.HostSerialNumbers[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Labels != null) {
            this.Labels = new AndroidInstanceLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AndroidInstanceLabel(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArraySimple(map, prefix + "HostSerialNumbers.", this.HostSerialNumbers);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

