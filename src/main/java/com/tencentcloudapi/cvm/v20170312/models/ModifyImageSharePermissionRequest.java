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

public class ModifyImageSharePermissionRequest extends AbstractModel {

    /**
    * 镜像ID，形如`img-gvbnzy6f`。镜像Id可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> <br>镜像ID必须指定为状态为`NORMAL`的镜像。镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 接收共享镜像的主账号ID列表，array型参数的格式可以参考[API简介](/document/api/213/568)。账号ID不同于QQ号，查询用户主账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
    * 操作，包括 `SHARE`，`CANCEL`。其中`SHARE`代表共享操作，`CANCEL`代表取消共享操作。
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get 镜像ID，形如`img-gvbnzy6f`。镜像Id可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> <br>镜像ID必须指定为状态为`NORMAL`的镜像。镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。 
     * @return ImageId 镜像ID，形如`img-gvbnzy6f`。镜像Id可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> <br>镜像ID必须指定为状态为`NORMAL`的镜像。镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID，形如`img-gvbnzy6f`。镜像Id可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> <br>镜像ID必须指定为状态为`NORMAL`的镜像。镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
     * @param ImageId 镜像ID，形如`img-gvbnzy6f`。镜像Id可以通过如下方式获取：<br><li>通过[DescribeImages](https://cloud.tencent.com/document/api/213/15715)接口返回的`ImageId`获取。</li><br><li>通过[镜像控制台](https://console.cloud.tencent.com/cvm/image)获取。</li> <br>镜像ID必须指定为状态为`NORMAL`的镜像。镜像状态请参考[镜像数据表](https://cloud.tencent.com/document/product/213/15753#Image)。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 接收共享镜像的主账号ID列表，array型参数的格式可以参考[API简介](/document/api/213/568)。账号ID不同于QQ号，查询用户主账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。 
     * @return AccountIds 接收共享镜像的主账号ID列表，array型参数的格式可以参考[API简介](/document/api/213/568)。账号ID不同于QQ号，查询用户主账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set 接收共享镜像的主账号ID列表，array型参数的格式可以参考[API简介](/document/api/213/568)。账号ID不同于QQ号，查询用户主账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
     * @param AccountIds 接收共享镜像的主账号ID列表，array型参数的格式可以参考[API简介](/document/api/213/568)。账号ID不同于QQ号，查询用户主账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    /**
     * Get 操作，包括 `SHARE`，`CANCEL`。其中`SHARE`代表共享操作，`CANCEL`代表取消共享操作。 
     * @return Permission 操作，包括 `SHARE`，`CANCEL`。其中`SHARE`代表共享操作，`CANCEL`代表取消共享操作。
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 操作，包括 `SHARE`，`CANCEL`。其中`SHARE`代表共享操作，`CANCEL`代表取消共享操作。
     * @param Permission 操作，包括 `SHARE`，`CANCEL`。其中`SHARE`代表共享操作，`CANCEL`代表取消共享操作。
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public ModifyImageSharePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageSharePermissionRequest(ModifyImageSharePermissionRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.AccountIds != null) {
            this.AccountIds = new String[source.AccountIds.length];
            for (int i = 0; i < source.AccountIds.length; i++) {
                this.AccountIds[i] = new String(source.AccountIds[i]);
            }
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

