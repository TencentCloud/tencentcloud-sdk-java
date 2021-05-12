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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemType extends AbstractModel{

    /**
    * 安卓系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Android")
    @Expose
    private OsData [] Android;

    /**
    * linux系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Linux")
    @Expose
    private OsData [] Linux;

    /**
    * LiteOs系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiteOs")
    @Expose
    private OsData [] LiteOs;

    /**
     * Get 安卓系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Android 安卓系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OsData [] getAndroid() {
        return this.Android;
    }

    /**
     * Set 安卓系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param Android 安卓系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAndroid(OsData [] Android) {
        this.Android = Android;
    }

    /**
     * Get linux系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Linux linux系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OsData [] getLinux() {
        return this.Linux;
    }

    /**
     * Set linux系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param Linux linux系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinux(OsData [] Linux) {
        this.Linux = Linux;
    }

    /**
     * Get LiteOs系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiteOs LiteOs系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OsData [] getLiteOs() {
        return this.LiteOs;
    }

    /**
     * Set LiteOs系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiteOs LiteOs系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiteOs(OsData [] LiteOs) {
        this.LiteOs = LiteOs;
    }

    public SystemType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemType(SystemType source) {
        if (source.Android != null) {
            this.Android = new OsData[source.Android.length];
            for (int i = 0; i < source.Android.length; i++) {
                this.Android[i] = new OsData(source.Android[i]);
            }
        }
        if (source.Linux != null) {
            this.Linux = new OsData[source.Linux.length];
            for (int i = 0; i < source.Linux.length; i++) {
                this.Linux[i] = new OsData(source.Linux[i]);
            }
        }
        if (source.LiteOs != null) {
            this.LiteOs = new OsData[source.LiteOs.length];
            for (int i = 0; i < source.LiteOs.length; i++) {
                this.LiteOs[i] = new OsData(source.LiteOs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Android.", this.Android);
        this.setParamArrayObj(map, prefix + "Linux.", this.Linux);
        this.setParamArrayObj(map, prefix + "LiteOs.", this.LiteOs);

    }
}

