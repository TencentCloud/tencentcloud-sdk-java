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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DoDirectoryOperationRequest extends AbstractModel {

    /**
    * <p>文件系统 ID。当前仅 Turbo 系列文件系统支持调用此接口，通用系列文件系统（含增强型）不支持调用。</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>create：创建目录，等同于mkdir。<br>check：确认目录是否存在，等同于stat。<br>move：对文件/目录进行重命名，等同于mv。</p>
    */
    @SerializedName("OpetationType")
    @Expose
    private String OpetationType;

    /**
    * <p>系统会默认递归创建路径中的所有父级目录。路径必须从 /cfs/ 开始，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li><p>若操作为 create/check</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul></li><li><p>若操作为 move</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/subdir/test1/test2</li></ul></li></ul>
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * <p>创建目录的权限，若不传，默认为0755。若OperationType为 check，此值无实际意义。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>mv 操作的目标目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/test3/test4</li><li>若挂载的是CFS子目录 /subdir，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/subdir/ test3/test4</li></ul>
    */
    @SerializedName("DestPath")
    @Expose
    private String DestPath;

    /**
     * Get <p>文件系统 ID。当前仅 Turbo 系列文件系统支持调用此接口，通用系列文件系统（含增强型）不支持调用。</p> 
     * @return FileSystemId <p>文件系统 ID。当前仅 Turbo 系列文件系统支持调用此接口，通用系列文件系统（含增强型）不支持调用。</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID。当前仅 Turbo 系列文件系统支持调用此接口，通用系列文件系统（含增强型）不支持调用。</p>
     * @param FileSystemId <p>文件系统 ID。当前仅 Turbo 系列文件系统支持调用此接口，通用系列文件系统（含增强型）不支持调用。</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>create：创建目录，等同于mkdir。<br>check：确认目录是否存在，等同于stat。<br>move：对文件/目录进行重命名，等同于mv。</p> 
     * @return OpetationType <p>create：创建目录，等同于mkdir。<br>check：确认目录是否存在，等同于stat。<br>move：对文件/目录进行重命名，等同于mv。</p>
     */
    public String getOpetationType() {
        return this.OpetationType;
    }

    /**
     * Set <p>create：创建目录，等同于mkdir。<br>check：确认目录是否存在，等同于stat。<br>move：对文件/目录进行重命名，等同于mv。</p>
     * @param OpetationType <p>create：创建目录，等同于mkdir。<br>check：确认目录是否存在，等同于stat。<br>move：对文件/目录进行重命名，等同于mv。</p>
     */
    public void setOpetationType(String OpetationType) {
        this.OpetationType = OpetationType;
    }

    /**
     * Get <p>系统会默认递归创建路径中的所有父级目录。路径必须从 /cfs/ 开始，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li><p>若操作为 create/check</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul></li><li><p>若操作为 move</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/subdir/test1/test2</li></ul></li></ul> 
     * @return DirectoryPath <p>系统会默认递归创建路径中的所有父级目录。路径必须从 /cfs/ 开始，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li><p>若操作为 create/check</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul></li><li><p>若操作为 move</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/subdir/test1/test2</li></ul></li></ul>
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set <p>系统会默认递归创建路径中的所有父级目录。路径必须从 /cfs/ 开始，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li><p>若操作为 create/check</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul></li><li><p>若操作为 move</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/subdir/test1/test2</li></ul></li></ul>
     * @param DirectoryPath <p>系统会默认递归创建路径中的所有父级目录。路径必须从 /cfs/ 开始，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li><p>若操作为 create/check</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下创建/检查是否存在 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul></li><li><p>若操作为 move</p><ul><li>若挂载的是CFS根目录 /，需在挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需在挂载路径下挂载路径下移动 test1/test2 下的文件到 DestPath，则入参值为 /cfs/subdir/test1/test2</li></ul></li></ul>
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get <p>创建目录的权限，若不传，默认为0755。若OperationType为 check，此值无实际意义。</p> 
     * @return Mode <p>创建目录的权限，若不传，默认为0755。若OperationType为 check，此值无实际意义。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>创建目录的权限，若不传，默认为0755。若OperationType为 check，此值无实际意义。</p>
     * @param Mode <p>创建目录的权限，若不传，默认为0755。若OperationType为 check，此值无实际意义。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>mv 操作的目标目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/test3/test4</li><li>若挂载的是CFS子目录 /subdir，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/subdir/ test3/test4</li></ul> 
     * @return DestPath <p>mv 操作的目标目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/test3/test4</li><li>若挂载的是CFS子目录 /subdir，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/subdir/ test3/test4</li></ul>
     */
    public String getDestPath() {
        return this.DestPath;
    }

    /**
     * Set <p>mv 操作的目标目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/test3/test4</li><li>若挂载的是CFS子目录 /subdir，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/subdir/ test3/test4</li></ul>
     * @param DestPath <p>mv 操作的目标目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/test3/test4</li><li>若挂载的是CFS子目录 /subdir，需将 DirectoryPath 下的文件移动到挂载路径下的 test3/test4，则入参值为 /cfs/subdir/ test3/test4</li></ul>
     */
    public void setDestPath(String DestPath) {
        this.DestPath = DestPath;
    }

    public DoDirectoryOperationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoDirectoryOperationRequest(DoDirectoryOperationRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.OpetationType != null) {
            this.OpetationType = new String(source.OpetationType);
        }
        if (source.DirectoryPath != null) {
            this.DirectoryPath = new String(source.DirectoryPath);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.DestPath != null) {
            this.DestPath = new String(source.DestPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "OpetationType", this.OpetationType);
        this.setParamSimple(map, prefix + "DirectoryPath", this.DirectoryPath);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "DestPath", this.DestPath);

    }
}

