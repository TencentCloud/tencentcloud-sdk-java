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

public class ChcDeployExtraConfig extends AbstractModel {

    /**
    * <p>MiniOS类型。是使用腾讯云的MiniOS，还是客户私有的MiniOS。</p><p>枚举值：</p><ul><li>public： 腾讯云的MiniOS。</li><li>private： 客户私有的MiniOS。</li></ul>
    */
    @SerializedName("MiniOsType")
    @Expose
    private String MiniOsType;

    /**
    * <p>服务器的架构和启动方式。</p><p>枚举值：</p><ul><li>x86_legacy： X86架构、Legacy启动模式。</li><li>x86_uefi： X86架构、UEFI启动模式。</li><li>arm_uefi： ARM架构，UEFI启动模式。</li></ul>
    */
    @SerializedName("BootType")
    @Expose
    private String BootType;

    /**
    * <p>PXE使用的引导文件。默认为pxelinux.0。</p>
    */
    @SerializedName("BootFile")
    @Expose
    private String BootFile;

    /**
    * <p>TFTP服务器的IP地址。</p>
    */
    @SerializedName("NextServerAddress")
    @Expose
    private String NextServerAddress;

    /**
     * Get <p>MiniOS类型。是使用腾讯云的MiniOS，还是客户私有的MiniOS。</p><p>枚举值：</p><ul><li>public： 腾讯云的MiniOS。</li><li>private： 客户私有的MiniOS。</li></ul> 
     * @return MiniOsType <p>MiniOS类型。是使用腾讯云的MiniOS，还是客户私有的MiniOS。</p><p>枚举值：</p><ul><li>public： 腾讯云的MiniOS。</li><li>private： 客户私有的MiniOS。</li></ul>
     */
    public String getMiniOsType() {
        return this.MiniOsType;
    }

    /**
     * Set <p>MiniOS类型。是使用腾讯云的MiniOS，还是客户私有的MiniOS。</p><p>枚举值：</p><ul><li>public： 腾讯云的MiniOS。</li><li>private： 客户私有的MiniOS。</li></ul>
     * @param MiniOsType <p>MiniOS类型。是使用腾讯云的MiniOS，还是客户私有的MiniOS。</p><p>枚举值：</p><ul><li>public： 腾讯云的MiniOS。</li><li>private： 客户私有的MiniOS。</li></ul>
     */
    public void setMiniOsType(String MiniOsType) {
        this.MiniOsType = MiniOsType;
    }

    /**
     * Get <p>服务器的架构和启动方式。</p><p>枚举值：</p><ul><li>x86_legacy： X86架构、Legacy启动模式。</li><li>x86_uefi： X86架构、UEFI启动模式。</li><li>arm_uefi： ARM架构，UEFI启动模式。</li></ul> 
     * @return BootType <p>服务器的架构和启动方式。</p><p>枚举值：</p><ul><li>x86_legacy： X86架构、Legacy启动模式。</li><li>x86_uefi： X86架构、UEFI启动模式。</li><li>arm_uefi： ARM架构，UEFI启动模式。</li></ul>
     */
    public String getBootType() {
        return this.BootType;
    }

    /**
     * Set <p>服务器的架构和启动方式。</p><p>枚举值：</p><ul><li>x86_legacy： X86架构、Legacy启动模式。</li><li>x86_uefi： X86架构、UEFI启动模式。</li><li>arm_uefi： ARM架构，UEFI启动模式。</li></ul>
     * @param BootType <p>服务器的架构和启动方式。</p><p>枚举值：</p><ul><li>x86_legacy： X86架构、Legacy启动模式。</li><li>x86_uefi： X86架构、UEFI启动模式。</li><li>arm_uefi： ARM架构，UEFI启动模式。</li></ul>
     */
    public void setBootType(String BootType) {
        this.BootType = BootType;
    }

    /**
     * Get <p>PXE使用的引导文件。默认为pxelinux.0。</p> 
     * @return BootFile <p>PXE使用的引导文件。默认为pxelinux.0。</p>
     */
    public String getBootFile() {
        return this.BootFile;
    }

    /**
     * Set <p>PXE使用的引导文件。默认为pxelinux.0。</p>
     * @param BootFile <p>PXE使用的引导文件。默认为pxelinux.0。</p>
     */
    public void setBootFile(String BootFile) {
        this.BootFile = BootFile;
    }

    /**
     * Get <p>TFTP服务器的IP地址。</p> 
     * @return NextServerAddress <p>TFTP服务器的IP地址。</p>
     */
    public String getNextServerAddress() {
        return this.NextServerAddress;
    }

    /**
     * Set <p>TFTP服务器的IP地址。</p>
     * @param NextServerAddress <p>TFTP服务器的IP地址。</p>
     */
    public void setNextServerAddress(String NextServerAddress) {
        this.NextServerAddress = NextServerAddress;
    }

    public ChcDeployExtraConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcDeployExtraConfig(ChcDeployExtraConfig source) {
        if (source.MiniOsType != null) {
            this.MiniOsType = new String(source.MiniOsType);
        }
        if (source.BootType != null) {
            this.BootType = new String(source.BootType);
        }
        if (source.BootFile != null) {
            this.BootFile = new String(source.BootFile);
        }
        if (source.NextServerAddress != null) {
            this.NextServerAddress = new String(source.NextServerAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniOsType", this.MiniOsType);
        this.setParamSimple(map, prefix + "BootType", this.BootType);
        this.setParamSimple(map, prefix + "BootFile", this.BootFile);
        this.setParamSimple(map, prefix + "NextServerAddress", this.NextServerAddress);

    }
}

