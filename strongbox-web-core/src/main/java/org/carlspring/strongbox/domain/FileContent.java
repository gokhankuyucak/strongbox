package org.carlspring.strongbox.domain;

import java.util.Date;

public class FileContent
{
    private String name;

    private Long size;

    private Date lastModified;

    private String storageId;

    private String repositoryId;

    private String artifactPath;

    public FileContent()
    {

    }

    public FileContent(String name)
    {
        setName(name);
    }

    public String getName()
    {
        return name;
    }

    public Long getSize()
    {
        return size;
    }

    public Date getLastModified()
    {
        return lastModified;
    }

    public String getStorageId()
    {
        return storageId;
    }

    public String getRepositoryId()
    {
        return repositoryId;
    }

    public String getArtifactPath()
    {
        return artifactPath;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSize(Long size)
    {
        this.size = size;
    }

    public void setLastModified(Date lastModified)
    {
        this.lastModified = lastModified;
    }

    public void setStorageId(String storageId)
    {
        this.storageId = storageId;
    }

    public void setRepositoryId(String repositoryId)
    {
        this.repositoryId = repositoryId;
    }

    public void setArtifactPath(String artifactPath)
    {
        this.artifactPath = artifactPath;
    }
}

