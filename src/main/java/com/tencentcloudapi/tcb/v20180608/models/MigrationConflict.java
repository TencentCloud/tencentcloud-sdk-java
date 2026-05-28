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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationConflict extends AbstractModel {

    /**
    * <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据库已应用migration的版本名</p><p>参数格式：仅允许小写字母和下划线</p>
    */
    @SerializedName("RemoteName")
    @Expose
    private String RemoteName;

    /**
    * <p>本次sql计算出来的checksum</p>
    */
    @SerializedName("LocalChecksum")
    @Expose
    private String LocalChecksum;

    /**
    * <p>已应用的migration，数据库存储的checksum</p>
    */
    @SerializedName("RemoteChecksum")
    @Expose
    private String RemoteChecksum;

    /**
    * <p>归入该分组的原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>冲突信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p> 
     * @return Version <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     * @param Version <p>migration 版本号</p><p>参数格式：纯数字，14位时间格式</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p> 
     * @return Name <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     * @param Name <p>migration 版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据库已应用migration的版本名</p><p>参数格式：仅允许小写字母和下划线</p> 
     * @return RemoteName <p>数据库已应用migration的版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     */
    public String getRemoteName() {
        return this.RemoteName;
    }

    /**
     * Set <p>数据库已应用migration的版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     * @param RemoteName <p>数据库已应用migration的版本名</p><p>参数格式：仅允许小写字母和下划线</p>
     */
    public void setRemoteName(String RemoteName) {
        this.RemoteName = RemoteName;
    }

    /**
     * Get <p>本次sql计算出来的checksum</p> 
     * @return LocalChecksum <p>本次sql计算出来的checksum</p>
     */
    public String getLocalChecksum() {
        return this.LocalChecksum;
    }

    /**
     * Set <p>本次sql计算出来的checksum</p>
     * @param LocalChecksum <p>本次sql计算出来的checksum</p>
     */
    public void setLocalChecksum(String LocalChecksum) {
        this.LocalChecksum = LocalChecksum;
    }

    /**
     * Get <p>已应用的migration，数据库存储的checksum</p> 
     * @return RemoteChecksum <p>已应用的migration，数据库存储的checksum</p>
     */
    public String getRemoteChecksum() {
        return this.RemoteChecksum;
    }

    /**
     * Set <p>已应用的migration，数据库存储的checksum</p>
     * @param RemoteChecksum <p>已应用的migration，数据库存储的checksum</p>
     */
    public void setRemoteChecksum(String RemoteChecksum) {
        this.RemoteChecksum = RemoteChecksum;
    }

    /**
     * Get <p>归入该分组的原因</p> 
     * @return Reason <p>归入该分组的原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>归入该分组的原因</p>
     * @param Reason <p>归入该分组的原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>冲突信息</p> 
     * @return Message <p>冲突信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>冲突信息</p>
     * @param Message <p>冲突信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public MigrationConflict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationConflict(MigrationConflict source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RemoteName != null) {
            this.RemoteName = new String(source.RemoteName);
        }
        if (source.LocalChecksum != null) {
            this.LocalChecksum = new String(source.LocalChecksum);
        }
        if (source.RemoteChecksum != null) {
            this.RemoteChecksum = new String(source.RemoteChecksum);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RemoteName", this.RemoteName);
        this.setParamSimple(map, prefix + "LocalChecksum", this.LocalChecksum);
        this.setParamSimple(map, prefix + "RemoteChecksum", this.RemoteChecksum);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

