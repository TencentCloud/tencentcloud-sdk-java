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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidApp extends AbstractModel {

    /**
    * 安卓应用 Id
    */
    @SerializedName("AndroidAppId")
    @Expose
    private String AndroidAppId;

    /**
    * 安卓应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 安卓应用状态（上架、下架）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 安卓应用版本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AndroidAppVersionInfo")
    @Expose
    private AndroidAppVersionInfo [] AndroidAppVersionInfo;

    /**
    * 安卓应用创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 安卓应用 Id 
     * @return AndroidAppId 安卓应用 Id
     */
    public String getAndroidAppId() {
        return this.AndroidAppId;
    }

    /**
     * Set 安卓应用 Id
     * @param AndroidAppId 安卓应用 Id
     */
    public void setAndroidAppId(String AndroidAppId) {
        this.AndroidAppId = AndroidAppId;
    }

    /**
     * Get 安卓应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 安卓应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安卓应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 安卓应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 安卓应用状态（上架、下架） 
     * @return State 安卓应用状态（上架、下架）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 安卓应用状态（上架、下架）
     * @param State 安卓应用状态（上架、下架）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 安卓应用版本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AndroidAppVersionInfo 安卓应用版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AndroidAppVersionInfo [] getAndroidAppVersionInfo() {
        return this.AndroidAppVersionInfo;
    }

    /**
     * Set 安卓应用版本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AndroidAppVersionInfo 安卓应用版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAndroidAppVersionInfo(AndroidAppVersionInfo [] AndroidAppVersionInfo) {
        this.AndroidAppVersionInfo = AndroidAppVersionInfo;
    }

    /**
     * Get 安卓应用创建时间 
     * @return CreateTime 安卓应用创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 安卓应用创建时间
     * @param CreateTime 安卓应用创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AndroidApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidApp(AndroidApp source) {
        if (source.AndroidAppId != null) {
            this.AndroidAppId = new String(source.AndroidAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AndroidAppVersionInfo != null) {
            this.AndroidAppVersionInfo = new AndroidAppVersionInfo[source.AndroidAppVersionInfo.length];
            for (int i = 0; i < source.AndroidAppVersionInfo.length; i++) {
                this.AndroidAppVersionInfo[i] = new AndroidAppVersionInfo(source.AndroidAppVersionInfo[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppId", this.AndroidAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "AndroidAppVersionInfo.", this.AndroidAppVersionInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

