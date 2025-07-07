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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStorageLocation extends AbstractModel {

    /**
    * 备份仓库名称	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 存储仓库所属地域，比如COS广州(ap-guangzhou)	
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 存储服务提供方，默认腾讯云	
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 对象存储桶名称，如果是COS必须是tke-backup-前缀开头	
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 对象存储桶路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 存储仓库状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 详细状态信息	
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 最后一次检查时间	
    */
    @SerializedName("LastValidationTime")
    @Expose
    private String LastValidationTime;

    /**
     * Get 备份仓库名称	 
     * @return Name 备份仓库名称	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 备份仓库名称	
     * @param Name 备份仓库名称	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 存储仓库所属地域，比如COS广州(ap-guangzhou)	 
     * @return StorageRegion 存储仓库所属地域，比如COS广州(ap-guangzhou)	
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 存储仓库所属地域，比如COS广州(ap-guangzhou)	
     * @param StorageRegion 存储仓库所属地域，比如COS广州(ap-guangzhou)	
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 存储服务提供方，默认腾讯云	 
     * @return Provider 存储服务提供方，默认腾讯云	
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 存储服务提供方，默认腾讯云	
     * @param Provider 存储服务提供方，默认腾讯云	
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 对象存储桶名称，如果是COS必须是tke-backup-前缀开头	 
     * @return Bucket 对象存储桶名称，如果是COS必须是tke-backup-前缀开头	
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 对象存储桶名称，如果是COS必须是tke-backup-前缀开头	
     * @param Bucket 对象存储桶名称，如果是COS必须是tke-backup-前缀开头	
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 对象存储桶路径 
     * @return Path 对象存储桶路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 对象存储桶路径
     * @param Path 对象存储桶路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 存储仓库状态 
     * @return State 存储仓库状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 存储仓库状态
     * @param State 存储仓库状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 详细状态信息	 
     * @return Message 详细状态信息	
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 详细状态信息	
     * @param Message 详细状态信息	
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 最后一次检查时间	 
     * @return LastValidationTime 最后一次检查时间	
     */
    public String getLastValidationTime() {
        return this.LastValidationTime;
    }

    /**
     * Set 最后一次检查时间	
     * @param LastValidationTime 最后一次检查时间	
     */
    public void setLastValidationTime(String LastValidationTime) {
        this.LastValidationTime = LastValidationTime;
    }

    public BackupStorageLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStorageLocation(BackupStorageLocation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.LastValidationTime != null) {
            this.LastValidationTime = new String(source.LastValidationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "LastValidationTime", this.LastValidationTime);

    }
}

