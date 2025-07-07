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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapshotsSharePermissionRequest extends AbstractModel {

    /**
    * 快照ID, 可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * 接收分享快照的账号Id列表，array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/568)。账号ID不同于QQ号，查询用户账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
    * 操作，包括 SHARE，CANCEL。其中SHARE代表分享操作，CANCEL代表取消分享操作。
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get 快照ID, 可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。 
     * @return SnapshotIds 快照ID, 可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 快照ID, 可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
     * @param SnapshotIds 快照ID, 可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get 接收分享快照的账号Id列表，array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/568)。账号ID不同于QQ号，查询用户账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。 
     * @return AccountIds 接收分享快照的账号Id列表，array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/568)。账号ID不同于QQ号，查询用户账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set 接收分享快照的账号Id列表，array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/568)。账号ID不同于QQ号，查询用户账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
     * @param AccountIds 接收分享快照的账号Id列表，array型参数的格式可以参考[API简介](https://cloud.tencent.com/document/api/213/568)。账号ID不同于QQ号，查询用户账号ID请查看[账号信息](https://console.cloud.tencent.com/developer)中的账号ID栏。
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    /**
     * Get 操作，包括 SHARE，CANCEL。其中SHARE代表分享操作，CANCEL代表取消分享操作。 
     * @return Permission 操作，包括 SHARE，CANCEL。其中SHARE代表分享操作，CANCEL代表取消分享操作。
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 操作，包括 SHARE，CANCEL。其中SHARE代表分享操作，CANCEL代表取消分享操作。
     * @param Permission 操作，包括 SHARE，CANCEL。其中SHARE代表分享操作，CANCEL代表取消分享操作。
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    public ModifySnapshotsSharePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotsSharePermissionRequest(ModifySnapshotsSharePermissionRequest source) {
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

